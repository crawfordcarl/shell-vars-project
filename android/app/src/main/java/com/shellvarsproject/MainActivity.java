package com.shellvarsproject;

import android.content.Intent;
import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.shellvarsproject.shellparams.ShellParams;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "ShellVarsProject";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ShellParams.setParams(getIntent().getExtras());
  }

  @Override
  public void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    ShellParams.setParams(intent.getExtras());
  }
}
