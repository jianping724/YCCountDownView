package com.ns.yc.lib;


import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/**
 * <pre>
 *     @author yangchong
 *     blog  : https://github.com/yangchong211/YCStatusBar
 *     time  : 2017/5/18
 *     desc  : 自定义BaseSavedState
 *     revise:
 * </pre>
 */
public class CountDownState extends View.BaseSavedState {

    int mLoadingTime;
    int mLocation;
    boolean isRunning;

    public static final Parcelable.Creator<CountDownState> CREATOR
            = new Parcelable.Creator<CountDownState>() {
        @Override
        public CountDownState createFromParcel(Parcel in) {
            return new CountDownState(in);
        }

        @Override
        public CountDownState[] newArray(int size) {
            return new CountDownState[size];
        }
    };

    CountDownState(Parcelable superState) {
        super(superState);
    }

    CountDownState(Parcel source) {
        super(source);
        mLoadingTime = source.readInt();
        mLocation = source.readInt();
        isRunning = source.readInt() == 1;
    }

    @Override public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeInt(mLoadingTime);
        out.writeInt(mLocation);
        out.writeInt(isRunning ? 1 : 0);
    }
}
