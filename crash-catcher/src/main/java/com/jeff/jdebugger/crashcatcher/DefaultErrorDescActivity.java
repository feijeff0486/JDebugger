package com.jeff.jdebugger.crashcatcher;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * 只有全屏错误信息的页面
 *
 * @author Jeff
 * @date 2020/04/23 17:48
 *
 * <a href="mailto:feijeff0486@gmail.com">Contact me</a>
 * <a href="https://github.com/feijeff0486">Follow me</a>
 */
public class DefaultErrorDescActivity extends Activity {
    private TextView tvDesc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TypedArray a = obtainStyledAttributes(R.styleable.AppCompatTheme);
        if (!a.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
            setTheme(R.style.Theme_AppCompat_Light_DarkActionBar);
        }
        a.recycle();

        setContentView(R.layout.activity_error_desc);
        tvDesc = findViewById(R.id.tv_desc);
        tvDesc.setText(CustomActivityOnCrash.getAllErrorDetailsFromIntent(DefaultErrorDescActivity.this, getIntent()));
    }
}
