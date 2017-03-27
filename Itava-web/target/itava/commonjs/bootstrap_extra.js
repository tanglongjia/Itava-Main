
function PWindow(options){
	  var thsize = "size-wide";
	  if(options.size){
		  thsize =  options.size;
	  }
	  var buttons = [];
		
		if(options.buttons){
			buttons = options.buttons;
		}
		
	  var dialogInstance = BootstrapDialog.show({
		   title: options.title,
		   size:  thsize,
		   message: '<iframe name="'+options.id+'" width="100%"  height="'+getCurrentWinidowHeight()+'px"  src="'+options.url+'" frameborder="0"></iframe>',
		   buttons:buttons,
      onshow: function(dialogRef){
		  
      },
      onshown: function(dialogRef){
    	  dialogRef.getModal().find('iframe').get(0).contentWindow.currentDialogInstance = dialogRef;
    	  dialogRef.options_tmp = options;
      },
      onhide: function(dialogRef){
    	  $(dialogRef).removeData("bs.modal");
      },
      onhidden: function(dialogRef){
    	  $(dialogRef).removeData("bs.modal");
      }
	});
	return dialogInstance;
}
function getCurrentWinidowHeight(){
	return $(window).height()-250;
}

function alertMsg(msg){
	BootstrapDialog.show({
		   title: "提示信息",
		   message: msg,
		   buttons: [{
	       label: '确定',
	       action: function(dialogRef){
	           dialogRef.close();
	       }
	  }]
	});
	 return false;
}

function alertMsgError(msg){
		BootstrapDialog.show({
			   title: "错误信息",
			   message: msg,
			   buttons: [{
		       label: '确定',
		       action: function(dialogRef){
		           dialogRef.close();
		       }
		  }]
		});
		 return false;
}

function alertMsgInfo(msg){
	 BootstrapDialog.show({
		   title: "提示信息",
		   message: msg,
		   buttons: [{
              label: '确定',
              action: function(dialogRef){
                  dialogRef.close();
              }
         }]
	  });
	 return false;
}

function alertMsgQuestion(msg){
		  BootstrapDialog.show({
			   title: "询　　问",
			   message: msg,
			   buttons: [{
	                label: '确定',
	                action: function(dialogRef){
	                    dialogRef.close();
	                }
	           }]
		  });
		  
		  return false;
}


function alertConfirm(msg,fn){
	BootstrapDialog.confirm({
		title: '提示信息',
		message: msg,
		closable: true, // <-- Default value is false
		draggable: true, // <-- Default value is false
		btnCancelLabel: '取消', // <-- Default value is 'Cancel',
		btnOKLabel: '确定', // <-- Default value is 'OK',
		btnOKClass: 'btn-default', // <-- If you didn't specify it, dialog type will be used,
		callback: function(result) {
			if(result) {
				if(typeof fn == 'function'){
					fn();
				}

			}
		}
	});
	return false;
}