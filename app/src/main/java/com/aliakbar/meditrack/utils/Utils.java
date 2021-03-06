package com.aliakbar.meditrack.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;

/**
 * Created by ALIAKBAR on 20-06-2017.
 */

public class Utils {

    private ProgressDialog mProgressDialog;

    public static String getTagForFragment(Fragment fragment) {
        return fragment.getClass().getSimpleName();
    }

    public static String getDeviceId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ANDROID_ID);
    }

    public void showProgressDialog(Context context) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(context);
            mProgressDialog.setIndeterminate(true);
        }

        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }
}
