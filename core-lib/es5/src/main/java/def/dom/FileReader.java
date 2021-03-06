package def.dom;
@jsweet.lang.Extends({MSBaseReader.class})
public class FileReader extends EventTarget {
    public DOMError error;
    native public void readAsArrayBuffer(Blob blob);
    native public void readAsBinaryString(Blob blob);
    native public void readAsDataURL(Blob blob);
    native public void readAsText(Blob blob, String encoding);
    public static FileReader prototype;
    public FileReader(){}
    public java.util.function.Function<Event,Object> onabort;
    public java.util.function.Function<Event,Object> onerror;
    public java.util.function.Function<Event,Object> onload;
    public java.util.function.Function<ProgressEvent,Object> onloadend;
    public java.util.function.Function<Event,Object> onloadstart;
    public java.util.function.Function<ProgressEvent,Object> onprogress;
    public double readyState;
    public Object result;
    native public void abort();
    public double DONE;
    public double EMPTY;
    public double LOADING;
    native public void addEventListener(jsweet.util.StringTypes.abort type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.error type, java.util.function.Function<ErrorEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.load type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.loadend type, java.util.function.Function<ProgressEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.loadstart type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.progress type, java.util.function.Function<ProgressEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(String type, EventListener listener, Boolean useCapture);
    native public void readAsText(Blob blob);
    native public void addEventListener(String type, EventListener listener);
    native public void addEventListener(jsweet.util.StringTypes.abort type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.error type, java.util.function.Function<ErrorEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.load type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.loadend type, java.util.function.Function<ProgressEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.loadstart type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.progress type, java.util.function.Function<ProgressEvent,Object> listener);
    native public void addEventListener(String type, EventListenerObject listener, Boolean useCapture);
    native public void addEventListener(String type, EventListenerObject listener);
}

