
package org.holoeverywhere.demo;

import org.holoeverywhere.LayoutInflater;
import org.holoeverywhere.ThemeManager;
import org.holoeverywhere.app.Application;
import org.holoeverywhere.app.Application.Config.PreferenceImpl;
import org.holoeverywhere.demo.widget.DemoNavigationItem;
import org.holoeverywhere.demo.widget.WidgetContainer;

public class DemoApplication extends Application {
    static {
        config().setDebugMode(true).setPreferenceImpl(PreferenceImpl.JSON);
        LayoutInflater.remap(WidgetContainer.class);
        LayoutInflater.remap(DemoNavigationItem.class);
        ThemeManager.setDefaultTheme(ThemeManager.MIXED);
        // Android 2.1 incorrect process FULLSCREEN flag
        // ThemeManager.modify(ThemeManager.FULLSCREEN);
        ThemeManager.map(ThemeManager.DARK,
                R.style.Holo_Demo_Theme);
        ThemeManager.map(ThemeManager.LIGHT,
                R.style.Holo_Demo_Theme_Light);
        ThemeManager.map(ThemeManager.MIXED,
                R.style.Holo_Demo_Theme_Light_DarkActionBar);
    }
}
