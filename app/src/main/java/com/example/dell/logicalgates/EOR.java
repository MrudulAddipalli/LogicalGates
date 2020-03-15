
package com.example.dell.logicalgates;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.widget.Toast;
        import java.net.MalformedURLException;
        import java.net.URL;
public class EOR extends AppCompatActivity {
    public WebView mwebView;
    public URL link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and);
        Toast.makeText(getApplicationContext(), "Please Wait\nChecking Connection", Toast.LENGTH_SHORT).show();
        mwebView =findViewById(R.id.webview1);
        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        mwebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        mwebView.getSettings().setAppCacheEnabled(true);
        mwebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        try {
            link= new URL("https://www.freeinfosociety.com/media.php?id=787");
            mwebView.loadUrl(String.valueOf(link));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}