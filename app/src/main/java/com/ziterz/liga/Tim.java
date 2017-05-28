package com.ziterz.liga;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ziter on 5/27/2017.
 */

public class Tim implements Parcelable {
    String namaSingkat;
    String namaLengkap;
    String urlLogo;


    public Tim(String namaSingkat, String namaLengkap, String urlLogo) {
        this.namaSingkat = namaSingkat;
        this.namaLengkap = namaLengkap;
        this.urlLogo = urlLogo;
    }

    public String getNamaSingkat() {
        return namaSingkat;
    }

    public void setNamaSingkat(String namaSingkat) {
        this.namaSingkat = namaSingkat;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaSingkat);
        dest.writeString(this.namaLengkap);
        dest.writeString(this.urlLogo);
    }

    protected Tim(Parcel in) {
        this.namaSingkat = in.readString();
        this.namaLengkap = in.readString();
        this.urlLogo = in.readString();
    }

    public static final Parcelable.Creator<Tim> CREATOR = new Parcelable.Creator<Tim>() {
        @Override
        public Tim createFromParcel(Parcel source) {
            return new Tim(source);
        }

        @Override
        public Tim[] newArray(int size) {
            return new Tim[size];
        }
    };
}
