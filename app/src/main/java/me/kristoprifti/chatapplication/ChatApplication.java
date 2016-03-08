package me.kristoprifti.chatapplication;

import android.app.Application;

import com.parse.Parse;

public class ChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "X1XeayRVQN0yEPHQ64rQCLGSiWbU17RS6dWJKQau", "PcCrzbWHjiLnMilnGoz5hUDqCqAgID6dThRtwVmQ");
    }
}
