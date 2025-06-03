package R2;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC0865b0;
import com.google.android.gms.internal.measurement.AbstractC0856a0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Q1 extends AbstractBinderC0865b0 implements R1 {
    public Q1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0865b0
    public final boolean n(int i7, Parcel parcel, Parcel parcel2, int i8) {
        List L02;
        switch (i7) {
            case 1:
                I i9 = (I) AbstractC0856a0.a(parcel, I.CREATOR);
                W5 w52 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                R0(i9, w52);
                parcel2.writeNoException();
                return true;
            case 2:
                R5 r52 = (R5) AbstractC0856a0.a(parcel, R5.CREATOR);
                W5 w53 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                Z(r52, w53);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                W5 w54 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                c0(w54);
                parcel2.writeNoException();
                return true;
            case 5:
                I i10 = (I) AbstractC0856a0.a(parcel, I.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC0856a0.f(parcel);
                S0(i10, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                W5 w55 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                N(w55);
                parcel2.writeNoException();
                return true;
            case 7:
                W5 w56 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                boolean h7 = AbstractC0856a0.h(parcel);
                AbstractC0856a0.f(parcel);
                L02 = L0(w56, h7);
                parcel2.writeNoException();
                parcel2.writeTypedList(L02);
                return true;
            case 9:
                I i11 = (I) AbstractC0856a0.a(parcel, I.CREATOR);
                String readString3 = parcel.readString();
                AbstractC0856a0.f(parcel);
                byte[] M02 = M0(i11, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(M02);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                AbstractC0856a0.f(parcel);
                I0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                W5 w57 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                String G6 = G(w57);
                parcel2.writeNoException();
                parcel2.writeString(G6);
                return true;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                C0497e c0497e = (C0497e) AbstractC0856a0.a(parcel, C0497e.CREATOR);
                W5 w58 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                m0(c0497e, w58);
                parcel2.writeNoException();
                return true;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                C0497e c0497e2 = (C0497e) AbstractC0856a0.a(parcel, C0497e.CREATOR);
                AbstractC0856a0.f(parcel);
                n0(c0497e2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h8 = AbstractC0856a0.h(parcel);
                W5 w59 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                L02 = x0(readString7, readString8, h8, w59);
                parcel2.writeNoException();
                parcel2.writeTypedList(L02);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean h9 = AbstractC0856a0.h(parcel);
                AbstractC0856a0.f(parcel);
                L02 = W(readString9, readString10, readString11, h9);
                parcel2.writeNoException();
                parcel2.writeTypedList(L02);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                W5 w510 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                L02 = V0(readString12, readString13, w510);
                parcel2.writeNoException();
                parcel2.writeTypedList(L02);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                AbstractC0856a0.f(parcel);
                L02 = K0(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(L02);
                return true;
            case 18:
                W5 w511 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                D0(w511);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                W5 w512 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                O0(bundle, w512);
                parcel2.writeNoException();
                return true;
            case 20:
                W5 w513 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                U0(w513);
                parcel2.writeNoException();
                return true;
            case 21:
                W5 w514 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                AbstractC0856a0.f(parcel);
                C0560n P02 = P0(w514);
                parcel2.writeNoException();
                AbstractC0856a0.g(parcel2, P02);
                return true;
            case 24:
                W5 w515 = (W5) AbstractC0856a0.a(parcel, W5.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                AbstractC0856a0.f(parcel);
                L02 = F(w515, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(L02);
                return true;
        }
    }
}
