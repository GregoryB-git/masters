package v0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f15196a;

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f15197a;

        /* renamed from: b, reason: collision with root package name */
        public final d f15198b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15199c = true;

        public a(TextView textView) {
            this.f15197a = textView;
            this.f15198b = new d(textView);
        }

        @Override // v0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (this.f15199c) {
                int length = inputFilterArr.length;
                for (InputFilter inputFilter : inputFilterArr) {
                    if (inputFilter == this.f15198b) {
                        return inputFilterArr;
                    }
                }
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = this.f15198b;
                return inputFilterArr2;
            }
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter2 = inputFilterArr[i10];
                if (inputFilter2 instanceof d) {
                    sparseArray.put(i10, inputFilter2);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length2; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr3[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr3;
        }

        @Override // v0.f.b
        public final void b(boolean z10) {
            if (z10) {
                d();
            }
        }

        @Override // v0.f.b
        public final void c(boolean z10) {
            this.f15199c = z10;
            d();
            this.f15197a.setFilters(a(this.f15197a.getFilters()));
        }

        public final void d() {
            TransformationMethod transformationMethod = this.f15197a.getTransformationMethod();
            if (this.f15199c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f15206a;
            }
            this.f15197a.setTransformationMethod(transformationMethod);
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z10) {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f15200a;

        public c(TextView textView) {
            this.f15200a = new a(textView);
        }

        @Override // v0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return (androidx.emoji2.text.d.f978j != null) ^ true ? inputFilterArr : this.f15200a.a(inputFilterArr);
        }

        @Override // v0.f.b
        public final void b(boolean z10) {
            if (!(androidx.emoji2.text.d.f978j != null)) {
                return;
            }
            this.f15200a.b(z10);
        }

        @Override // v0.f.b
        public final void c(boolean z10) {
            if (!(androidx.emoji2.text.d.f978j != null)) {
                this.f15200a.f15199c = z10;
            } else {
                this.f15200a.c(z10);
            }
        }
    }

    public f(TextView textView) {
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f15196a = new c(textView);
    }
}
