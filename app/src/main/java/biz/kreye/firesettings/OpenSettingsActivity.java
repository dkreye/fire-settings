package biz.kreye.firesettings;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

/**
 * Opens the full Fire TV settings directly. Launcher replacements such as
 * Projectivy intercept the usual route, which briefly brings Amazon's home
 * screen to the front. Falls back to the generic Android settings.
 */
public class OpenSettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent fire = new Intent()
                .setComponent(new ComponentName(
                        "com.amazon.tv.launcher",
                        "com.amazon.tv.launcher.ui.MainSettingsActivity"))
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try {
            startActivity(fire);
        } catch (RuntimeException e) {
            startActivity(new Intent(Settings.ACTION_SETTINGS).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        }
        finish();
    }
}
