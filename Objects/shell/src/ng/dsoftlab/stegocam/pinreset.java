
package ng.dsoftlab.stegocam;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class pinreset implements IRemote{
	public static pinreset mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public pinreset() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("pinreset"), "ng.dsoftlab.stegocam.pinreset");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, pinreset.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _actoolbarlight1 = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
public static RemoteObject _toolbarhelper = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACActionBar");
public static RemoteObject _sharedprefs = RemoteObject.declareNull("com.b4x.sharedpreferences.SharedPreferences");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _btncancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnsave = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblerrormsg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblerrormsg2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblshowpswd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblshowpswd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtconfirmnewpin = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnewpin = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static ng.dsoftlab.stegocam.main _main = null;
public static ng.dsoftlab.stegocam.starter _starter = null;
public static ng.dsoftlab.stegocam.mainmenu _mainmenu = null;
public static ng.dsoftlab.stegocam.config _config = null;
public static ng.dsoftlab.stegocam.encode _encode = null;
public static ng.dsoftlab.stegocam.settings _settings = null;
public static ng.dsoftlab.stegocam.pinsetup _pinsetup = null;
public static ng.dsoftlab.stegocam.forgotpin _forgotpin = null;
public static ng.dsoftlab.stegocam.login _login = null;
public static ng.dsoftlab.stegocam.pinchange _pinchange = null;
public static ng.dsoftlab.stegocam.securityquestion _securityquestion = null;
public static ng.dsoftlab.stegocam.history _history = null;
public static ng.dsoftlab.stegocam.b4xcollections _b4xcollections = null;
public static ng.dsoftlab.stegocam.httputils2service _httputils2service = null;
public static ng.dsoftlab.stegocam.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",pinreset.mostCurrent._activity,"ACToolBarLight1",pinreset.mostCurrent._actoolbarlight1,"B4XCollections",Debug.moduleToString(ng.dsoftlab.stegocam.b4xcollections.class),"btnCancel",pinreset.mostCurrent._btncancel,"btnSave",pinreset.mostCurrent._btnsave,"config",Debug.moduleToString(ng.dsoftlab.stegocam.config.class),"DateUtils",pinreset.mostCurrent._dateutils,"encode",Debug.moduleToString(ng.dsoftlab.stegocam.encode.class),"forgotpin",Debug.moduleToString(ng.dsoftlab.stegocam.forgotpin.class),"history",Debug.moduleToString(ng.dsoftlab.stegocam.history.class),"HttpUtils2Service",Debug.moduleToString(ng.dsoftlab.stegocam.httputils2service.class),"IME",pinreset.mostCurrent._ime,"lblErrorMsg",pinreset.mostCurrent._lblerrormsg,"lblErrorMsg2",pinreset.mostCurrent._lblerrormsg2,"lblShowPswd",pinreset.mostCurrent._lblshowpswd,"lblShowPswd2",pinreset.mostCurrent._lblshowpswd2,"Login",Debug.moduleToString(ng.dsoftlab.stegocam.login.class),"Main",Debug.moduleToString(ng.dsoftlab.stegocam.main.class),"mainmenu",Debug.moduleToString(ng.dsoftlab.stegocam.mainmenu.class),"PinChange",Debug.moduleToString(ng.dsoftlab.stegocam.pinchange.class),"PinSetup",Debug.moduleToString(ng.dsoftlab.stegocam.pinsetup.class),"securityquestion",Debug.moduleToString(ng.dsoftlab.stegocam.securityquestion.class),"settings",Debug.moduleToString(ng.dsoftlab.stegocam.settings.class),"SharedPrefs",pinreset.mostCurrent._sharedprefs,"Starter",Debug.moduleToString(ng.dsoftlab.stegocam.starter.class),"ToolbarHelper",pinreset.mostCurrent._toolbarhelper,"txtConfirmNewPIN",pinreset.mostCurrent._txtconfirmnewpin,"txtNewPin",pinreset.mostCurrent._txtnewpin,"XUIViewsUtils",Debug.moduleToString(ng.dsoftlab.stegocam.xuiviewsutils.class)};
}
}