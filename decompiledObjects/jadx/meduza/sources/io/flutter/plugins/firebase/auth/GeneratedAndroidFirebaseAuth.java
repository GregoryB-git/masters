package io.flutter.plugins.firebase.auth;

import aa.m0;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class GeneratedAndroidFirebaseAuth {

    public enum ActionCodeInfoOperation {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);

        public final int index;

        ActionCodeInfoOperation(int i10) {
            this.index = i10;
        }
    }

    public static final class AuthPigeonFirebaseApp {
        private String appName;
        private String customAuthDomain;
        private String tenantId;

        public static final class Builder {
            private String appName;
            private String customAuthDomain;
            private String tenantId;

            public AuthPigeonFirebaseApp build() {
                AuthPigeonFirebaseApp authPigeonFirebaseApp = new AuthPigeonFirebaseApp();
                authPigeonFirebaseApp.setAppName(this.appName);
                authPigeonFirebaseApp.setTenantId(this.tenantId);
                authPigeonFirebaseApp.setCustomAuthDomain(this.customAuthDomain);
                return authPigeonFirebaseApp;
            }

            public Builder setAppName(String str) {
                this.appName = str;
                return this;
            }

            public Builder setCustomAuthDomain(String str) {
                this.customAuthDomain = str;
                return this;
            }

            public Builder setTenantId(String str) {
                this.tenantId = str;
                return this;
            }
        }

        public static AuthPigeonFirebaseApp fromList(ArrayList<Object> arrayList) {
            AuthPigeonFirebaseApp authPigeonFirebaseApp = new AuthPigeonFirebaseApp();
            authPigeonFirebaseApp.setAppName((String) arrayList.get(0));
            authPigeonFirebaseApp.setTenantId((String) arrayList.get(1));
            authPigeonFirebaseApp.setCustomAuthDomain((String) arrayList.get(2));
            return authPigeonFirebaseApp;
        }

        public String getAppName() {
            return this.appName;
        }

        public String getCustomAuthDomain() {
            return this.customAuthDomain;
        }

        public String getTenantId() {
            return this.tenantId;
        }

        public void setAppName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appName\" is null.");
            }
            this.appName = str;
        }

        public void setCustomAuthDomain(String str) {
            this.customAuthDomain = str;
        }

        public void setTenantId(String str) {
            this.tenantId = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.appName);
            arrayList.add(this.tenantId);
            arrayList.add(this.customAuthDomain);
            return arrayList;
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    public interface FirebaseAuthHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$FirebaseAuthHostApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return FirebaseAuthHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.registerIdTokenListener((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.registerAuthStateListener((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithEmailAndPassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.11
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithEmailLink((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.12
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.13
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.signOut((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.14
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.fetchSignInMethodsForEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<List<String>>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.15
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(List<String> list) {
                        arrayList.add(0, list);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void i(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.sendPasswordResetEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.16
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void j(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.sendSignInLinkToEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.17
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void k(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.setLanguageCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.18
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void l(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.setSettings((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonFirebaseAuthSettings) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.19
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void m(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.verifyPasswordResetCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.20
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void n(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                AuthPigeonFirebaseApp authPigeonFirebaseApp = (AuthPigeonFirebaseApp) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                Number number = (Number) arrayList2.get(2);
                firebaseAuthHostApi.useEmulator(authPigeonFirebaseApp, str, number == null ? null : Long.valueOf(number.longValue()), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void o(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.verifyPhoneNumber((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonVerifyPhoneNumberRequest) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.21
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void p(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.revokeTokenWithAuthorizationCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.22
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void q(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.applyActionCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.4
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void r(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.checkActionCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonActionCodeInfo>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.5
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonActionCodeInfo pigeonActionCodeInfo) {
                        arrayList.add(0, pigeonActionCodeInfo);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void s(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.confirmPasswordReset((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.6
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void t(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.createUserWithEmailAndPassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.7
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void u(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.signInAnonymously((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.8
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void v(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.9
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void w(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithCustomToken((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.10
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void x(BinaryMessenger binaryMessenger, FirebaseAuthHostApi firebaseAuthHostApi) {
                y(binaryMessenger, "", firebaseAuthHostApi);
            }

            public static void y(BinaryMessenger binaryMessenger, String str, final FirebaseAuthHostApi firebaseAuthHostApi) {
                String d10 = str.isEmpty() ? "" : defpackage.g.d(".", str);
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener", d10), a());
                final int i10 = 0;
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.p
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener", d10), a());
                final int i11 = 2;
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.t
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator", d10), a());
                final int i12 = 3;
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.s
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.t
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode", d10), a());
                final int i13 = 4;
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.p
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.q
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.s
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.t
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential", d10), a());
                final int i14 = 5;
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.p
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i14) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel9.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.q
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i14) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel10.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.q
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel11.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.s
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel12.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.t
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel13.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut", d10), a());
                final int i15 = 1;
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.p
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel14.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.q
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel15.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.s
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel16.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.t
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i15) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel17.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.p
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel18.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.q
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel19.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.s
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel20.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel21.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.p
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel21.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode", d10), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel22.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.q
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    break;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel22.setMessageHandler(null);
                }
            }
        }

        void applyActionCode(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, VoidResult voidResult);

        void checkActionCode(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<PigeonActionCodeInfo> result);

        void confirmPasswordReset(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, VoidResult voidResult);

        void createUserWithEmailAndPassword(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, Result<PigeonUserCredential> result);

        void fetchSignInMethodsForEmail(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<List<String>> result);

        void registerAuthStateListener(AuthPigeonFirebaseApp authPigeonFirebaseApp, Result<String> result);

        void registerIdTokenListener(AuthPigeonFirebaseApp authPigeonFirebaseApp, Result<String> result);

        void revokeTokenWithAuthorizationCode(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, VoidResult voidResult);

        void sendPasswordResetEmail(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, PigeonActionCodeSettings pigeonActionCodeSettings, VoidResult voidResult);

        void sendSignInLinkToEmail(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, PigeonActionCodeSettings pigeonActionCodeSettings, VoidResult voidResult);

        void setLanguageCode(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<String> result);

        void setSettings(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings, VoidResult voidResult);

        void signInAnonymously(AuthPigeonFirebaseApp authPigeonFirebaseApp, Result<PigeonUserCredential> result);

        void signInWithCredential(AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, Result<PigeonUserCredential> result);

        void signInWithCustomToken(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<PigeonUserCredential> result);

        void signInWithEmailAndPassword(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, Result<PigeonUserCredential> result);

        void signInWithEmailLink(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, Result<PigeonUserCredential> result);

        void signInWithProvider(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonSignInProvider pigeonSignInProvider, Result<PigeonUserCredential> result);

        void signOut(AuthPigeonFirebaseApp authPigeonFirebaseApp, VoidResult voidResult);

        void useEmulator(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Long l10, VoidResult voidResult);

        void verifyPasswordResetCode(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<String> result);

        void verifyPhoneNumber(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, Result<String> result);
    }

    public static class FirebaseAuthHostApiCodec extends StandardMessageCodec {
        public static final FirebaseAuthHostApiCodec INSTANCE = new FirebaseAuthHostApiCodec();

        private FirebaseAuthHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonActionCodeInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonActionCodeInfoData.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonActionCodeSettings.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return PigeonFirebaseAuthSettings.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return PigeonIdTokenResult.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PigeonSignInProvider.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PigeonUserProfile.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PigeonVerifyPhoneNumberRequest.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(128);
                list = ((AuthPigeonFirebaseApp) obj).toList();
            } else if (obj instanceof PigeonActionCodeInfo) {
                byteArrayOutputStream.write(129);
                list = ((PigeonActionCodeInfo) obj).toList();
            } else if (obj instanceof PigeonActionCodeInfoData) {
                byteArrayOutputStream.write(130);
                list = ((PigeonActionCodeInfoData) obj).toList();
            } else if (obj instanceof PigeonActionCodeSettings) {
                byteArrayOutputStream.write(131);
                list = ((PigeonActionCodeSettings) obj).toList();
            } else if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(132);
                list = ((PigeonAdditionalUserInfo) obj).toList();
            } else if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(133);
                list = ((PigeonAuthCredential) obj).toList();
            } else if (obj instanceof PigeonFirebaseAuthSettings) {
                byteArrayOutputStream.write(134);
                list = ((PigeonFirebaseAuthSettings) obj).toList();
            } else if (obj instanceof PigeonIdTokenResult) {
                byteArrayOutputStream.write(135);
                list = ((PigeonIdTokenResult) obj).toList();
            } else if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                list = ((PigeonMultiFactorInfo) obj).toList();
            } else if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(137);
                list = ((PigeonMultiFactorSession) obj).toList();
            } else if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(138);
                list = ((PigeonPhoneMultiFactorAssertion) obj).toList();
            } else if (obj instanceof PigeonSignInProvider) {
                byteArrayOutputStream.write(139);
                list = ((PigeonSignInProvider) obj).toList();
            } else if (obj instanceof PigeonTotpSecret) {
                byteArrayOutputStream.write(140);
                list = ((PigeonTotpSecret) obj).toList();
            } else if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(141);
                list = ((PigeonUserCredential) obj).toList();
            } else if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(142);
                list = ((PigeonUserDetails) obj).toList();
            } else if (obj instanceof PigeonUserInfo) {
                byteArrayOutputStream.write(143);
                list = ((PigeonUserInfo) obj).toList();
            } else {
                if (!(obj instanceof PigeonUserProfile)) {
                    if (!(obj instanceof PigeonVerifyPhoneNumberRequest)) {
                        super.writeValue(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(145);
                        writeValue(byteArrayOutputStream, ((PigeonVerifyPhoneNumberRequest) obj).toList());
                        return;
                    }
                }
                byteArrayOutputStream.write(144);
                list = ((PigeonUserProfile) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    public interface FirebaseAuthUserHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$FirebaseAuthUserHostApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return FirebaseAuthUserHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthUserHostApi.delete((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.getIdToken((AuthPigeonFirebaseApp) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<PigeonIdTokenResult>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonIdTokenResult pigeonIdTokenResult) {
                        arrayList.add(0, pigeonIdTokenResult);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updatePassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.11
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updatePhoneNumber((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.12
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updateProfile((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonUserProfile) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.13
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.verifyBeforeUpdateEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.14
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.linkWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void i(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.linkWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.4
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void j(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.reauthenticateWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.5
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void k(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.reauthenticateWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.6
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void l(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthUserHostApi.reload((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.7
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void m(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.sendEmailVerification((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonActionCodeSettings) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.8
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void n(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.unlink((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.9
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void o(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updateEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.10
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void p(BinaryMessenger binaryMessenger, FirebaseAuthUserHostApi firebaseAuthUserHostApi) {
                q(binaryMessenger, "", firebaseAuthUserHostApi);
            }

            public static void q(BinaryMessenger binaryMessenger, String str, final FirebaseAuthUserHostApi firebaseAuthUserHostApi) {
                String d10 = str.isEmpty() ? "" : defpackage.g.d(".", str);
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete", d10), a());
                final int i10 = 0;
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.u
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken", d10), a());
                final int i11 = 1;
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.v
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.w
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.x
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential", d10), a());
                final int i12 = 2;
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.u
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.v
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.w
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.x
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink", d10), a());
                final int i13 = 3;
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.u
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel9.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.v
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i13) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel10.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.v
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel11.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.w
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel12.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.x
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel13.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail", d10), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.u
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel14.setMessageHandler(null);
                }
            }
        }

        void delete(AuthPigeonFirebaseApp authPigeonFirebaseApp, VoidResult voidResult);

        void getIdToken(AuthPigeonFirebaseApp authPigeonFirebaseApp, Boolean bool, Result<PigeonIdTokenResult> result);

        void linkWithCredential(AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, Result<PigeonUserCredential> result);

        void linkWithProvider(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonSignInProvider pigeonSignInProvider, Result<PigeonUserCredential> result);

        void reauthenticateWithCredential(AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, Result<PigeonUserCredential> result);

        void reauthenticateWithProvider(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonSignInProvider pigeonSignInProvider, Result<PigeonUserCredential> result);

        void reload(AuthPigeonFirebaseApp authPigeonFirebaseApp, Result<PigeonUserDetails> result);

        void sendEmailVerification(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonActionCodeSettings pigeonActionCodeSettings, VoidResult voidResult);

        void unlink(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<PigeonUserCredential> result);

        void updateEmail(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<PigeonUserDetails> result);

        void updatePassword(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Result<PigeonUserDetails> result);

        void updatePhoneNumber(AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, Result<PigeonUserDetails> result);

        void updateProfile(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonUserProfile pigeonUserProfile, Result<PigeonUserDetails> result);

        void verifyBeforeUpdateEmail(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, PigeonActionCodeSettings pigeonActionCodeSettings, VoidResult voidResult);
    }

    public static class FirebaseAuthUserHostApiCodec extends StandardMessageCodec {
        public static final FirebaseAuthUserHostApiCodec INSTANCE = new FirebaseAuthUserHostApiCodec();

        private FirebaseAuthUserHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonActionCodeInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonActionCodeInfoData.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonActionCodeSettings.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return PigeonFirebaseAuthSettings.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return PigeonIdTokenResult.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PigeonSignInProvider.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PigeonUserProfile.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PigeonVerifyPhoneNumberRequest.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(128);
                list = ((AuthPigeonFirebaseApp) obj).toList();
            } else if (obj instanceof PigeonActionCodeInfo) {
                byteArrayOutputStream.write(129);
                list = ((PigeonActionCodeInfo) obj).toList();
            } else if (obj instanceof PigeonActionCodeInfoData) {
                byteArrayOutputStream.write(130);
                list = ((PigeonActionCodeInfoData) obj).toList();
            } else if (obj instanceof PigeonActionCodeSettings) {
                byteArrayOutputStream.write(131);
                list = ((PigeonActionCodeSettings) obj).toList();
            } else if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(132);
                list = ((PigeonAdditionalUserInfo) obj).toList();
            } else if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(133);
                list = ((PigeonAuthCredential) obj).toList();
            } else if (obj instanceof PigeonFirebaseAuthSettings) {
                byteArrayOutputStream.write(134);
                list = ((PigeonFirebaseAuthSettings) obj).toList();
            } else if (obj instanceof PigeonIdTokenResult) {
                byteArrayOutputStream.write(135);
                list = ((PigeonIdTokenResult) obj).toList();
            } else if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                list = ((PigeonMultiFactorInfo) obj).toList();
            } else if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(137);
                list = ((PigeonMultiFactorSession) obj).toList();
            } else if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(138);
                list = ((PigeonPhoneMultiFactorAssertion) obj).toList();
            } else if (obj instanceof PigeonSignInProvider) {
                byteArrayOutputStream.write(139);
                list = ((PigeonSignInProvider) obj).toList();
            } else if (obj instanceof PigeonTotpSecret) {
                byteArrayOutputStream.write(140);
                list = ((PigeonTotpSecret) obj).toList();
            } else if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(141);
                list = ((PigeonUserCredential) obj).toList();
            } else if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(142);
                list = ((PigeonUserDetails) obj).toList();
            } else if (obj instanceof PigeonUserInfo) {
                byteArrayOutputStream.write(143);
                list = ((PigeonUserInfo) obj).toList();
            } else {
                if (!(obj instanceof PigeonUserProfile)) {
                    if (!(obj instanceof PigeonVerifyPhoneNumberRequest)) {
                        super.writeValue(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(145);
                        writeValue(byteArrayOutputStream, ((PigeonVerifyPhoneNumberRequest) obj).toList());
                        return;
                    }
                }
                byteArrayOutputStream.write(144);
                list = ((PigeonUserProfile) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface GenerateInterfaces {
        void pigeonInterface(PigeonMultiFactorInfo pigeonMultiFactorInfo);
    }

    public static class GenerateInterfacesCodec extends StandardMessageCodec {
        public static final GenerateInterfacesCodec INSTANCE = new GenerateInterfacesCodec();

        private GenerateInterfacesCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? super.readValueOfType(b10, byteBuffer) : PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof PigeonMultiFactorInfo)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
            }
        }
    }

    public interface MultiFactoResolverHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return MultiFactoResolverHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(MultiFactoResolverHostApi multiFactoResolverHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactoResolverHostApi.resolveSignIn((String) arrayList2.get(0), (PigeonPhoneMultiFactorAssertion) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void c(BinaryMessenger binaryMessenger, MultiFactoResolverHostApi multiFactoResolverHostApi) {
                d(binaryMessenger, "", multiFactoResolverHostApi);
            }

            public static void d(BinaryMessenger binaryMessenger, String str, MultiFactoResolverHostApi multiFactoResolverHostApi) {
                new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn", str.isEmpty() ? "" : defpackage.g.d(".", str)), a()).setMessageHandler(multiFactoResolverHostApi != null ? new g(multiFactoResolverHostApi, 24) : null);
            }
        }

        void resolveSignIn(String str, PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str2, Result<PigeonUserCredential> result);
    }

    public static class MultiFactoResolverHostApiCodec extends StandardMessageCodec {
        public static final MultiFactoResolverHostApiCodec INSTANCE = new MultiFactoResolverHostApiCodec();

        private MultiFactoResolverHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(128);
                list = ((PigeonAdditionalUserInfo) obj).toList();
            } else if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(129);
                list = ((PigeonAuthCredential) obj).toList();
            } else if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(130);
                list = ((PigeonPhoneMultiFactorAssertion) obj).toList();
            } else if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(131);
                list = ((PigeonUserCredential) obj).toList();
            } else {
                if (!(obj instanceof PigeonUserDetails)) {
                    if (!(obj instanceof PigeonUserInfo)) {
                        super.writeValue(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(133);
                        writeValue(byteArrayOutputStream, ((PigeonUserInfo) obj).toList());
                        return;
                    }
                }
                byteArrayOutputStream.write(132);
                list = ((PigeonUserDetails) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    public interface MultiFactorTotpHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return MultiFactorTotpHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                multiFactorTotpHostApi.generateSecret((String) ((ArrayList) obj).get(0), new Result<PigeonTotpSecret>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonTotpSecret pigeonTotpSecret) {
                        arrayList.add(0, pigeonTotpSecret);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpHostApi.getAssertionForEnrollment((String) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpHostApi.getAssertionForSignIn((String) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void e(BinaryMessenger binaryMessenger, MultiFactorTotpHostApi multiFactorTotpHostApi) {
                f(binaryMessenger, "", multiFactorTotpHostApi);
            }

            public static void f(BinaryMessenger binaryMessenger, String str, MultiFactorTotpHostApi multiFactorTotpHostApi) {
                String d10 = str.isEmpty() ? "" : defpackage.g.d(".", str);
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret", d10), a());
                int i10 = 15;
                if (multiFactorTotpHostApi != null) {
                    basicMessageChannel.setMessageHandler(new defpackage.d(multiFactorTotpHostApi, i10));
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment", d10), a());
                if (multiFactorTotpHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new defpackage.e(multiFactorTotpHostApi, 13));
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn", d10), a());
                if (multiFactorTotpHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new m0(multiFactorTotpHostApi, i10));
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
            }
        }

        void generateSecret(String str, Result<PigeonTotpSecret> result);

        void getAssertionForEnrollment(String str, String str2, Result<String> result);

        void getAssertionForSignIn(String str, String str2, Result<String> result);
    }

    public static class MultiFactorTotpHostApiCodec extends StandardMessageCodec {
        public static final MultiFactorTotpHostApiCodec INSTANCE = new MultiFactorTotpHostApiCodec();

        private MultiFactorTotpHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? super.readValueOfType(b10, byteBuffer) : PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof PigeonTotpSecret)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((PigeonTotpSecret) obj).toList());
            }
        }
    }

    public interface MultiFactorTotpSecretHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return new StandardMessageCodec();
            }

            public static /* synthetic */ void b(MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpSecretHostApi.generateQrCodeUrl((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpSecretHostApi.openInOtpApp((String) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void d(BinaryMessenger binaryMessenger, MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi) {
                e(binaryMessenger, "", multiFactorTotpSecretHostApi);
            }

            public static void e(BinaryMessenger binaryMessenger, String str, MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi) {
                String d10 = str.isEmpty() ? "" : defpackage.g.d(".", str);
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl", d10), a());
                if (multiFactorTotpSecretHostApi != null) {
                    basicMessageChannel.setMessageHandler(new g(multiFactorTotpSecretHostApi, 25));
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp", d10), a());
                if (multiFactorTotpSecretHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new defpackage.d(multiFactorTotpSecretHostApi, 16));
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
            }
        }

        void generateQrCodeUrl(String str, String str2, String str3, Result<String> result);

        void openInOtpApp(String str, String str2, VoidResult voidResult);
    }

    public interface MultiFactorUserHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return MultiFactorUserHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorUserHostApi.enrollPhone((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonPhoneMultiFactorAssertion) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorUserHostApi.enrollTotp((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                multiFactorUserHostApi.getSession((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonMultiFactorSession>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonMultiFactorSession pigeonMultiFactorSession) {
                        arrayList.add(0, pigeonMultiFactorSession);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorUserHostApi.unenroll((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.4
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                multiFactorUserHostApi.getEnrolledFactors((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<List<PigeonMultiFactorInfo>>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.5
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(List<PigeonMultiFactorInfo> list) {
                        arrayList.add(0, list);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void g(BinaryMessenger binaryMessenger, MultiFactorUserHostApi multiFactorUserHostApi) {
                h(binaryMessenger, "", multiFactorUserHostApi);
            }

            public static void h(BinaryMessenger binaryMessenger, String str, final MultiFactorUserHostApi multiFactorUserHostApi) {
                String d10 = str.isEmpty() ? "" : defpackage.g.d(".", str);
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone", d10), a());
                if (multiFactorUserHostApi != null) {
                    final int i10 = 0;
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.z
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.b(multiFactorUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.f(multiFactorUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp", d10), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new m0(multiFactorUserHostApi, 16));
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession", d10), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new g(multiFactorUserHostApi, 26));
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll", d10), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new defpackage.d(multiFactorUserHostApi, 17));
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.d("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors", d10), a());
                if (multiFactorUserHostApi == null) {
                    basicMessageChannel5.setMessageHandler(null);
                } else {
                    final int i11 = 1;
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.firebase.auth.z
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.b(multiFactorUserHostApi, obj, reply);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.f(multiFactorUserHostApi, obj, reply);
                                    break;
                            }
                        }
                    });
                }
            }
        }

        void enrollPhone(AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str, VoidResult voidResult);

        void enrollTotp(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, VoidResult voidResult);

        void getEnrolledFactors(AuthPigeonFirebaseApp authPigeonFirebaseApp, Result<List<PigeonMultiFactorInfo>> result);

        void getSession(AuthPigeonFirebaseApp authPigeonFirebaseApp, Result<PigeonMultiFactorSession> result);

        void unenroll(AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, VoidResult voidResult);
    }

    public static class MultiFactorUserHostApiCodec extends StandardMessageCodec {
        public static final MultiFactorUserHostApiCodec INSTANCE = new MultiFactorUserHostApiCodec();

        private MultiFactorUserHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b10, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(128);
                list = ((AuthPigeonFirebaseApp) obj).toList();
            } else if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(129);
                list = ((PigeonMultiFactorInfo) obj).toList();
            } else if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(130);
                list = ((PigeonMultiFactorSession) obj).toList();
            } else if (!(obj instanceof PigeonPhoneMultiFactorAssertion)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(131);
                list = ((PigeonPhoneMultiFactorAssertion) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    public interface NullableResult<T> {
        void error(Throwable th);

        void success(T t);
    }

    public static final class PigeonActionCodeInfo {
        private PigeonActionCodeInfoData data;
        private ActionCodeInfoOperation operation;

        public static final class Builder {
            private PigeonActionCodeInfoData data;
            private ActionCodeInfoOperation operation;

            public PigeonActionCodeInfo build() {
                PigeonActionCodeInfo pigeonActionCodeInfo = new PigeonActionCodeInfo();
                pigeonActionCodeInfo.setOperation(this.operation);
                pigeonActionCodeInfo.setData(this.data);
                return pigeonActionCodeInfo;
            }

            public Builder setData(PigeonActionCodeInfoData pigeonActionCodeInfoData) {
                this.data = pigeonActionCodeInfoData;
                return this;
            }

            public Builder setOperation(ActionCodeInfoOperation actionCodeInfoOperation) {
                this.operation = actionCodeInfoOperation;
                return this;
            }
        }

        public static PigeonActionCodeInfo fromList(ArrayList<Object> arrayList) {
            PigeonActionCodeInfo pigeonActionCodeInfo = new PigeonActionCodeInfo();
            pigeonActionCodeInfo.setOperation(ActionCodeInfoOperation.values()[((Integer) arrayList.get(0)).intValue()]);
            pigeonActionCodeInfo.setData((PigeonActionCodeInfoData) arrayList.get(1));
            return pigeonActionCodeInfo;
        }

        public PigeonActionCodeInfoData getData() {
            return this.data;
        }

        public ActionCodeInfoOperation getOperation() {
            return this.operation;
        }

        public void setData(PigeonActionCodeInfoData pigeonActionCodeInfoData) {
            if (pigeonActionCodeInfoData == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.data = pigeonActionCodeInfoData;
        }

        public void setOperation(ActionCodeInfoOperation actionCodeInfoOperation) {
            if (actionCodeInfoOperation == null) {
                throw new IllegalStateException("Nonnull field \"operation\" is null.");
            }
            this.operation = actionCodeInfoOperation;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            ActionCodeInfoOperation actionCodeInfoOperation = this.operation;
            arrayList.add(actionCodeInfoOperation == null ? null : Integer.valueOf(actionCodeInfoOperation.index));
            arrayList.add(this.data);
            return arrayList;
        }
    }

    public static final class PigeonActionCodeInfoData {
        private String email;
        private String previousEmail;

        public static final class Builder {
            private String email;
            private String previousEmail;

            public PigeonActionCodeInfoData build() {
                PigeonActionCodeInfoData pigeonActionCodeInfoData = new PigeonActionCodeInfoData();
                pigeonActionCodeInfoData.setEmail(this.email);
                pigeonActionCodeInfoData.setPreviousEmail(this.previousEmail);
                return pigeonActionCodeInfoData;
            }

            public Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            public Builder setPreviousEmail(String str) {
                this.previousEmail = str;
                return this;
            }
        }

        public static PigeonActionCodeInfoData fromList(ArrayList<Object> arrayList) {
            PigeonActionCodeInfoData pigeonActionCodeInfoData = new PigeonActionCodeInfoData();
            pigeonActionCodeInfoData.setEmail((String) arrayList.get(0));
            pigeonActionCodeInfoData.setPreviousEmail((String) arrayList.get(1));
            return pigeonActionCodeInfoData;
        }

        public String getEmail() {
            return this.email;
        }

        public String getPreviousEmail() {
            return this.previousEmail;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setPreviousEmail(String str) {
            this.previousEmail = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.email);
            arrayList.add(this.previousEmail);
            return arrayList;
        }
    }

    public static final class PigeonActionCodeSettings {
        private Boolean androidInstallApp;
        private String androidMinimumVersion;
        private String androidPackageName;
        private String dynamicLinkDomain;
        private Boolean handleCodeInApp;
        private String iOSBundleId;
        private String linkDomain;
        private String url;

        public static final class Builder {
            private Boolean androidInstallApp;
            private String androidMinimumVersion;
            private String androidPackageName;
            private String dynamicLinkDomain;
            private Boolean handleCodeInApp;
            private String iOSBundleId;
            private String linkDomain;
            private String url;

            public PigeonActionCodeSettings build() {
                PigeonActionCodeSettings pigeonActionCodeSettings = new PigeonActionCodeSettings();
                pigeonActionCodeSettings.setUrl(this.url);
                pigeonActionCodeSettings.setDynamicLinkDomain(this.dynamicLinkDomain);
                pigeonActionCodeSettings.setHandleCodeInApp(this.handleCodeInApp);
                pigeonActionCodeSettings.setIOSBundleId(this.iOSBundleId);
                pigeonActionCodeSettings.setAndroidPackageName(this.androidPackageName);
                pigeonActionCodeSettings.setAndroidInstallApp(this.androidInstallApp);
                pigeonActionCodeSettings.setAndroidMinimumVersion(this.androidMinimumVersion);
                pigeonActionCodeSettings.setLinkDomain(this.linkDomain);
                return pigeonActionCodeSettings;
            }

            public Builder setAndroidInstallApp(Boolean bool) {
                this.androidInstallApp = bool;
                return this;
            }

            public Builder setAndroidMinimumVersion(String str) {
                this.androidMinimumVersion = str;
                return this;
            }

            public Builder setAndroidPackageName(String str) {
                this.androidPackageName = str;
                return this;
            }

            public Builder setDynamicLinkDomain(String str) {
                this.dynamicLinkDomain = str;
                return this;
            }

            public Builder setHandleCodeInApp(Boolean bool) {
                this.handleCodeInApp = bool;
                return this;
            }

            public Builder setIOSBundleId(String str) {
                this.iOSBundleId = str;
                return this;
            }

            public Builder setLinkDomain(String str) {
                this.linkDomain = str;
                return this;
            }

            public Builder setUrl(String str) {
                this.url = str;
                return this;
            }
        }

        public static PigeonActionCodeSettings fromList(ArrayList<Object> arrayList) {
            PigeonActionCodeSettings pigeonActionCodeSettings = new PigeonActionCodeSettings();
            pigeonActionCodeSettings.setUrl((String) arrayList.get(0));
            pigeonActionCodeSettings.setDynamicLinkDomain((String) arrayList.get(1));
            pigeonActionCodeSettings.setHandleCodeInApp((Boolean) arrayList.get(2));
            pigeonActionCodeSettings.setIOSBundleId((String) arrayList.get(3));
            pigeonActionCodeSettings.setAndroidPackageName((String) arrayList.get(4));
            pigeonActionCodeSettings.setAndroidInstallApp((Boolean) arrayList.get(5));
            pigeonActionCodeSettings.setAndroidMinimumVersion((String) arrayList.get(6));
            pigeonActionCodeSettings.setLinkDomain((String) arrayList.get(7));
            return pigeonActionCodeSettings;
        }

        public Boolean getAndroidInstallApp() {
            return this.androidInstallApp;
        }

        public String getAndroidMinimumVersion() {
            return this.androidMinimumVersion;
        }

        public String getAndroidPackageName() {
            return this.androidPackageName;
        }

        public String getDynamicLinkDomain() {
            return this.dynamicLinkDomain;
        }

        public Boolean getHandleCodeInApp() {
            return this.handleCodeInApp;
        }

        public String getIOSBundleId() {
            return this.iOSBundleId;
        }

        public String getLinkDomain() {
            return this.linkDomain;
        }

        public String getUrl() {
            return this.url;
        }

        public void setAndroidInstallApp(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
            }
            this.androidInstallApp = bool;
        }

        public void setAndroidMinimumVersion(String str) {
            this.androidMinimumVersion = str;
        }

        public void setAndroidPackageName(String str) {
            this.androidPackageName = str;
        }

        public void setDynamicLinkDomain(String str) {
            this.dynamicLinkDomain = str;
        }

        public void setHandleCodeInApp(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
            }
            this.handleCodeInApp = bool;
        }

        public void setIOSBundleId(String str) {
            this.iOSBundleId = str;
        }

        public void setLinkDomain(String str) {
            this.linkDomain = str;
        }

        public void setUrl(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.url = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(8);
            arrayList.add(this.url);
            arrayList.add(this.dynamicLinkDomain);
            arrayList.add(this.handleCodeInApp);
            arrayList.add(this.iOSBundleId);
            arrayList.add(this.androidPackageName);
            arrayList.add(this.androidInstallApp);
            arrayList.add(this.androidMinimumVersion);
            arrayList.add(this.linkDomain);
            return arrayList;
        }
    }

    public static final class PigeonAdditionalUserInfo {
        private String authorizationCode;
        private Boolean isNewUser;
        private Map<String, Object> profile;
        private String providerId;
        private String username;

        public static final class Builder {
            private String authorizationCode;
            private Boolean isNewUser;
            private Map<String, Object> profile;
            private String providerId;
            private String username;

            public PigeonAdditionalUserInfo build() {
                PigeonAdditionalUserInfo pigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
                pigeonAdditionalUserInfo.setIsNewUser(this.isNewUser);
                pigeonAdditionalUserInfo.setProviderId(this.providerId);
                pigeonAdditionalUserInfo.setUsername(this.username);
                pigeonAdditionalUserInfo.setAuthorizationCode(this.authorizationCode);
                pigeonAdditionalUserInfo.setProfile(this.profile);
                return pigeonAdditionalUserInfo;
            }

            public Builder setAuthorizationCode(String str) {
                this.authorizationCode = str;
                return this;
            }

            public Builder setIsNewUser(Boolean bool) {
                this.isNewUser = bool;
                return this;
            }

            public Builder setProfile(Map<String, Object> map) {
                this.profile = map;
                return this;
            }

            public Builder setProviderId(String str) {
                this.providerId = str;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }
        }

        public static PigeonAdditionalUserInfo fromList(ArrayList<Object> arrayList) {
            PigeonAdditionalUserInfo pigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
            pigeonAdditionalUserInfo.setIsNewUser((Boolean) arrayList.get(0));
            pigeonAdditionalUserInfo.setProviderId((String) arrayList.get(1));
            pigeonAdditionalUserInfo.setUsername((String) arrayList.get(2));
            pigeonAdditionalUserInfo.setAuthorizationCode((String) arrayList.get(3));
            pigeonAdditionalUserInfo.setProfile((Map) arrayList.get(4));
            return pigeonAdditionalUserInfo;
        }

        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public Boolean getIsNewUser() {
            return this.isNewUser;
        }

        public Map<String, Object> getProfile() {
            return this.profile;
        }

        public String getProviderId() {
            return this.providerId;
        }

        public String getUsername() {
            return this.username;
        }

        public void setAuthorizationCode(String str) {
            this.authorizationCode = str;
        }

        public void setIsNewUser(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
            }
            this.isNewUser = bool;
        }

        public void setProfile(Map<String, Object> map) {
            this.profile = map;
        }

        public void setProviderId(String str) {
            this.providerId = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.isNewUser);
            arrayList.add(this.providerId);
            arrayList.add(this.username);
            arrayList.add(this.authorizationCode);
            arrayList.add(this.profile);
            return arrayList;
        }
    }

    public static final class PigeonAuthCredential {
        private String accessToken;
        private Long nativeId;
        private String providerId;
        private String signInMethod;

        public static final class Builder {
            private String accessToken;
            private Long nativeId;
            private String providerId;
            private String signInMethod;

            public PigeonAuthCredential build() {
                PigeonAuthCredential pigeonAuthCredential = new PigeonAuthCredential();
                pigeonAuthCredential.setProviderId(this.providerId);
                pigeonAuthCredential.setSignInMethod(this.signInMethod);
                pigeonAuthCredential.setNativeId(this.nativeId);
                pigeonAuthCredential.setAccessToken(this.accessToken);
                return pigeonAuthCredential;
            }

            public Builder setAccessToken(String str) {
                this.accessToken = str;
                return this;
            }

            public Builder setNativeId(Long l10) {
                this.nativeId = l10;
                return this;
            }

            public Builder setProviderId(String str) {
                this.providerId = str;
                return this;
            }

            public Builder setSignInMethod(String str) {
                this.signInMethod = str;
                return this;
            }
        }

        public static PigeonAuthCredential fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonAuthCredential pigeonAuthCredential = new PigeonAuthCredential();
            pigeonAuthCredential.setProviderId((String) arrayList.get(0));
            pigeonAuthCredential.setSignInMethod((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonAuthCredential.setNativeId(valueOf);
            pigeonAuthCredential.setAccessToken((String) arrayList.get(3));
            return pigeonAuthCredential;
        }

        public String getAccessToken() {
            return this.accessToken;
        }

        public Long getNativeId() {
            return this.nativeId;
        }

        public String getProviderId() {
            return this.providerId;
        }

        public String getSignInMethod() {
            return this.signInMethod;
        }

        public void setAccessToken(String str) {
            this.accessToken = str;
        }

        public void setNativeId(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
            }
            this.nativeId = l10;
        }

        public void setProviderId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.providerId = str;
        }

        public void setSignInMethod(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
            }
            this.signInMethod = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.providerId);
            arrayList.add(this.signInMethod);
            arrayList.add(this.nativeId);
            arrayList.add(this.accessToken);
            return arrayList;
        }
    }

    public static final class PigeonFirebaseAuthSettings {
        private Boolean appVerificationDisabledForTesting;
        private Boolean forceRecaptchaFlow;
        private String phoneNumber;
        private String smsCode;
        private String userAccessGroup;

        public static final class Builder {
            private Boolean appVerificationDisabledForTesting;
            private Boolean forceRecaptchaFlow;
            private String phoneNumber;
            private String smsCode;
            private String userAccessGroup;

            public PigeonFirebaseAuthSettings build() {
                PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
                pigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting(this.appVerificationDisabledForTesting);
                pigeonFirebaseAuthSettings.setUserAccessGroup(this.userAccessGroup);
                pigeonFirebaseAuthSettings.setPhoneNumber(this.phoneNumber);
                pigeonFirebaseAuthSettings.setSmsCode(this.smsCode);
                pigeonFirebaseAuthSettings.setForceRecaptchaFlow(this.forceRecaptchaFlow);
                return pigeonFirebaseAuthSettings;
            }

            public Builder setAppVerificationDisabledForTesting(Boolean bool) {
                this.appVerificationDisabledForTesting = bool;
                return this;
            }

            public Builder setForceRecaptchaFlow(Boolean bool) {
                this.forceRecaptchaFlow = bool;
                return this;
            }

            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
                return this;
            }

            public Builder setSmsCode(String str) {
                this.smsCode = str;
                return this;
            }

            public Builder setUserAccessGroup(String str) {
                this.userAccessGroup = str;
                return this;
            }
        }

        public static PigeonFirebaseAuthSettings fromList(ArrayList<Object> arrayList) {
            PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
            pigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting((Boolean) arrayList.get(0));
            pigeonFirebaseAuthSettings.setUserAccessGroup((String) arrayList.get(1));
            pigeonFirebaseAuthSettings.setPhoneNumber((String) arrayList.get(2));
            pigeonFirebaseAuthSettings.setSmsCode((String) arrayList.get(3));
            pigeonFirebaseAuthSettings.setForceRecaptchaFlow((Boolean) arrayList.get(4));
            return pigeonFirebaseAuthSettings;
        }

        public Boolean getAppVerificationDisabledForTesting() {
            return this.appVerificationDisabledForTesting;
        }

        public Boolean getForceRecaptchaFlow() {
            return this.forceRecaptchaFlow;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getSmsCode() {
            return this.smsCode;
        }

        public String getUserAccessGroup() {
            return this.userAccessGroup;
        }

        public void setAppVerificationDisabledForTesting(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
            }
            this.appVerificationDisabledForTesting = bool;
        }

        public void setForceRecaptchaFlow(Boolean bool) {
            this.forceRecaptchaFlow = bool;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setSmsCode(String str) {
            this.smsCode = str;
        }

        public void setUserAccessGroup(String str) {
            this.userAccessGroup = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.appVerificationDisabledForTesting);
            arrayList.add(this.userAccessGroup);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.smsCode);
            arrayList.add(this.forceRecaptchaFlow);
            return arrayList;
        }
    }

    public static final class PigeonIdTokenResult {
        private Long authTimestamp;
        private Map<String, Object> claims;
        private Long expirationTimestamp;
        private Long issuedAtTimestamp;
        private String signInProvider;
        private String signInSecondFactor;
        private String token;

        public static final class Builder {
            private Long authTimestamp;
            private Map<String, Object> claims;
            private Long expirationTimestamp;
            private Long issuedAtTimestamp;
            private String signInProvider;
            private String signInSecondFactor;
            private String token;

            public PigeonIdTokenResult build() {
                PigeonIdTokenResult pigeonIdTokenResult = new PigeonIdTokenResult();
                pigeonIdTokenResult.setToken(this.token);
                pigeonIdTokenResult.setExpirationTimestamp(this.expirationTimestamp);
                pigeonIdTokenResult.setAuthTimestamp(this.authTimestamp);
                pigeonIdTokenResult.setIssuedAtTimestamp(this.issuedAtTimestamp);
                pigeonIdTokenResult.setSignInProvider(this.signInProvider);
                pigeonIdTokenResult.setClaims(this.claims);
                pigeonIdTokenResult.setSignInSecondFactor(this.signInSecondFactor);
                return pigeonIdTokenResult;
            }

            public Builder setAuthTimestamp(Long l10) {
                this.authTimestamp = l10;
                return this;
            }

            public Builder setClaims(Map<String, Object> map) {
                this.claims = map;
                return this;
            }

            public Builder setExpirationTimestamp(Long l10) {
                this.expirationTimestamp = l10;
                return this;
            }

            public Builder setIssuedAtTimestamp(Long l10) {
                this.issuedAtTimestamp = l10;
                return this;
            }

            public Builder setSignInProvider(String str) {
                this.signInProvider = str;
                return this;
            }

            public Builder setSignInSecondFactor(String str) {
                this.signInSecondFactor = str;
                return this;
            }

            public Builder setToken(String str) {
                this.token = str;
                return this;
            }
        }

        public static PigeonIdTokenResult fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            Long valueOf2;
            PigeonIdTokenResult pigeonIdTokenResult = new PigeonIdTokenResult();
            pigeonIdTokenResult.setToken((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonIdTokenResult.setExpirationTimestamp(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonIdTokenResult.setAuthTimestamp(valueOf2);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                l10 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            pigeonIdTokenResult.setIssuedAtTimestamp(l10);
            pigeonIdTokenResult.setSignInProvider((String) arrayList.get(4));
            pigeonIdTokenResult.setClaims((Map) arrayList.get(5));
            pigeonIdTokenResult.setSignInSecondFactor((String) arrayList.get(6));
            return pigeonIdTokenResult;
        }

        public Long getAuthTimestamp() {
            return this.authTimestamp;
        }

        public Map<String, Object> getClaims() {
            return this.claims;
        }

        public Long getExpirationTimestamp() {
            return this.expirationTimestamp;
        }

        public Long getIssuedAtTimestamp() {
            return this.issuedAtTimestamp;
        }

        public String getSignInProvider() {
            return this.signInProvider;
        }

        public String getSignInSecondFactor() {
            return this.signInSecondFactor;
        }

        public String getToken() {
            return this.token;
        }

        public void setAuthTimestamp(Long l10) {
            this.authTimestamp = l10;
        }

        public void setClaims(Map<String, Object> map) {
            this.claims = map;
        }

        public void setExpirationTimestamp(Long l10) {
            this.expirationTimestamp = l10;
        }

        public void setIssuedAtTimestamp(Long l10) {
            this.issuedAtTimestamp = l10;
        }

        public void setSignInProvider(String str) {
            this.signInProvider = str;
        }

        public void setSignInSecondFactor(String str) {
            this.signInSecondFactor = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.token);
            arrayList.add(this.expirationTimestamp);
            arrayList.add(this.authTimestamp);
            arrayList.add(this.issuedAtTimestamp);
            arrayList.add(this.signInProvider);
            arrayList.add(this.claims);
            arrayList.add(this.signInSecondFactor);
            return arrayList;
        }
    }

    public static final class PigeonMultiFactorInfo {
        private String displayName;
        private Double enrollmentTimestamp;
        private String factorId;
        private String phoneNumber;
        private String uid;

        public static final class Builder {
            private String displayName;
            private Double enrollmentTimestamp;
            private String factorId;
            private String phoneNumber;
            private String uid;

            public PigeonMultiFactorInfo build() {
                PigeonMultiFactorInfo pigeonMultiFactorInfo = new PigeonMultiFactorInfo();
                pigeonMultiFactorInfo.setDisplayName(this.displayName);
                pigeonMultiFactorInfo.setEnrollmentTimestamp(this.enrollmentTimestamp);
                pigeonMultiFactorInfo.setFactorId(this.factorId);
                pigeonMultiFactorInfo.setUid(this.uid);
                pigeonMultiFactorInfo.setPhoneNumber(this.phoneNumber);
                return pigeonMultiFactorInfo;
            }

            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            public Builder setEnrollmentTimestamp(Double d10) {
                this.enrollmentTimestamp = d10;
                return this;
            }

            public Builder setFactorId(String str) {
                this.factorId = str;
                return this;
            }

            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
                return this;
            }

            public Builder setUid(String str) {
                this.uid = str;
                return this;
            }
        }

        public static PigeonMultiFactorInfo fromList(ArrayList<Object> arrayList) {
            PigeonMultiFactorInfo pigeonMultiFactorInfo = new PigeonMultiFactorInfo();
            pigeonMultiFactorInfo.setDisplayName((String) arrayList.get(0));
            pigeonMultiFactorInfo.setEnrollmentTimestamp((Double) arrayList.get(1));
            pigeonMultiFactorInfo.setFactorId((String) arrayList.get(2));
            pigeonMultiFactorInfo.setUid((String) arrayList.get(3));
            pigeonMultiFactorInfo.setPhoneNumber((String) arrayList.get(4));
            return pigeonMultiFactorInfo;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public Double getEnrollmentTimestamp() {
            return this.enrollmentTimestamp;
        }

        public String getFactorId() {
            return this.factorId;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getUid() {
            return this.uid;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setEnrollmentTimestamp(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.enrollmentTimestamp = d10;
        }

        public void setFactorId(String str) {
            this.factorId = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setUid(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.uid = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.displayName);
            arrayList.add(this.enrollmentTimestamp);
            arrayList.add(this.factorId);
            arrayList.add(this.uid);
            arrayList.add(this.phoneNumber);
            return arrayList;
        }
    }

    public static final class PigeonMultiFactorSession {
        private String id;

        public static final class Builder {
            private String id;

            public PigeonMultiFactorSession build() {
                PigeonMultiFactorSession pigeonMultiFactorSession = new PigeonMultiFactorSession();
                pigeonMultiFactorSession.setId(this.id);
                return pigeonMultiFactorSession;
            }

            public Builder setId(String str) {
                this.id = str;
                return this;
            }
        }

        public static PigeonMultiFactorSession fromList(ArrayList<Object> arrayList) {
            PigeonMultiFactorSession pigeonMultiFactorSession = new PigeonMultiFactorSession();
            pigeonMultiFactorSession.setId((String) arrayList.get(0));
            return pigeonMultiFactorSession;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.id = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.id);
            return arrayList;
        }
    }

    public static final class PigeonPhoneMultiFactorAssertion {
        private String verificationCode;
        private String verificationId;

        public static final class Builder {
            private String verificationCode;
            private String verificationId;

            public PigeonPhoneMultiFactorAssertion build() {
                PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
                pigeonPhoneMultiFactorAssertion.setVerificationId(this.verificationId);
                pigeonPhoneMultiFactorAssertion.setVerificationCode(this.verificationCode);
                return pigeonPhoneMultiFactorAssertion;
            }

            public Builder setVerificationCode(String str) {
                this.verificationCode = str;
                return this;
            }

            public Builder setVerificationId(String str) {
                this.verificationId = str;
                return this;
            }
        }

        public static PigeonPhoneMultiFactorAssertion fromList(ArrayList<Object> arrayList) {
            PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
            pigeonPhoneMultiFactorAssertion.setVerificationId((String) arrayList.get(0));
            pigeonPhoneMultiFactorAssertion.setVerificationCode((String) arrayList.get(1));
            return pigeonPhoneMultiFactorAssertion;
        }

        public String getVerificationCode() {
            return this.verificationCode;
        }

        public String getVerificationId() {
            return this.verificationId;
        }

        public void setVerificationCode(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.verificationCode = str;
        }

        public void setVerificationId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.verificationId = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.verificationId);
            arrayList.add(this.verificationCode);
            return arrayList;
        }
    }

    public static final class PigeonSignInProvider {
        private Map<String, String> customParameters;
        private String providerId;
        private List<String> scopes;

        public static final class Builder {
            private Map<String, String> customParameters;
            private String providerId;
            private List<String> scopes;

            public PigeonSignInProvider build() {
                PigeonSignInProvider pigeonSignInProvider = new PigeonSignInProvider();
                pigeonSignInProvider.setProviderId(this.providerId);
                pigeonSignInProvider.setScopes(this.scopes);
                pigeonSignInProvider.setCustomParameters(this.customParameters);
                return pigeonSignInProvider;
            }

            public Builder setCustomParameters(Map<String, String> map) {
                this.customParameters = map;
                return this;
            }

            public Builder setProviderId(String str) {
                this.providerId = str;
                return this;
            }

            public Builder setScopes(List<String> list) {
                this.scopes = list;
                return this;
            }
        }

        public static PigeonSignInProvider fromList(ArrayList<Object> arrayList) {
            PigeonSignInProvider pigeonSignInProvider = new PigeonSignInProvider();
            pigeonSignInProvider.setProviderId((String) arrayList.get(0));
            pigeonSignInProvider.setScopes((List) arrayList.get(1));
            pigeonSignInProvider.setCustomParameters((Map) arrayList.get(2));
            return pigeonSignInProvider;
        }

        public Map<String, String> getCustomParameters() {
            return this.customParameters;
        }

        public String getProviderId() {
            return this.providerId;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public void setCustomParameters(Map<String, String> map) {
            this.customParameters = map;
        }

        public void setProviderId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"providerId\" is null.");
            }
            this.providerId = str;
        }

        public void setScopes(List<String> list) {
            this.scopes = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.providerId);
            arrayList.add(this.scopes);
            arrayList.add(this.customParameters);
            return arrayList;
        }
    }

    public static final class PigeonTotpSecret {
        private Long codeIntervalSeconds;
        private Long codeLength;
        private Long enrollmentCompletionDeadline;
        private String hashingAlgorithm;
        private String secretKey;

        public static final class Builder {
            private Long codeIntervalSeconds;
            private Long codeLength;
            private Long enrollmentCompletionDeadline;
            private String hashingAlgorithm;
            private String secretKey;

            public PigeonTotpSecret build() {
                PigeonTotpSecret pigeonTotpSecret = new PigeonTotpSecret();
                pigeonTotpSecret.setCodeIntervalSeconds(this.codeIntervalSeconds);
                pigeonTotpSecret.setCodeLength(this.codeLength);
                pigeonTotpSecret.setEnrollmentCompletionDeadline(this.enrollmentCompletionDeadline);
                pigeonTotpSecret.setHashingAlgorithm(this.hashingAlgorithm);
                pigeonTotpSecret.setSecretKey(this.secretKey);
                return pigeonTotpSecret;
            }

            public Builder setCodeIntervalSeconds(Long l10) {
                this.codeIntervalSeconds = l10;
                return this;
            }

            public Builder setCodeLength(Long l10) {
                this.codeLength = l10;
                return this;
            }

            public Builder setEnrollmentCompletionDeadline(Long l10) {
                this.enrollmentCompletionDeadline = l10;
                return this;
            }

            public Builder setHashingAlgorithm(String str) {
                this.hashingAlgorithm = str;
                return this;
            }

            public Builder setSecretKey(String str) {
                this.secretKey = str;
                return this;
            }
        }

        public static PigeonTotpSecret fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            Long valueOf2;
            PigeonTotpSecret pigeonTotpSecret = new PigeonTotpSecret();
            Object obj = arrayList.get(0);
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonTotpSecret.setCodeIntervalSeconds(valueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonTotpSecret.setCodeLength(valueOf2);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                l10 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            pigeonTotpSecret.setEnrollmentCompletionDeadline(l10);
            pigeonTotpSecret.setHashingAlgorithm((String) arrayList.get(3));
            pigeonTotpSecret.setSecretKey((String) arrayList.get(4));
            return pigeonTotpSecret;
        }

        public Long getCodeIntervalSeconds() {
            return this.codeIntervalSeconds;
        }

        public Long getCodeLength() {
            return this.codeLength;
        }

        public Long getEnrollmentCompletionDeadline() {
            return this.enrollmentCompletionDeadline;
        }

        public String getHashingAlgorithm() {
            return this.hashingAlgorithm;
        }

        public String getSecretKey() {
            return this.secretKey;
        }

        public void setCodeIntervalSeconds(Long l10) {
            this.codeIntervalSeconds = l10;
        }

        public void setCodeLength(Long l10) {
            this.codeLength = l10;
        }

        public void setEnrollmentCompletionDeadline(Long l10) {
            this.enrollmentCompletionDeadline = l10;
        }

        public void setHashingAlgorithm(String str) {
            this.hashingAlgorithm = str;
        }

        public void setSecretKey(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
            }
            this.secretKey = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.codeIntervalSeconds);
            arrayList.add(this.codeLength);
            arrayList.add(this.enrollmentCompletionDeadline);
            arrayList.add(this.hashingAlgorithm);
            arrayList.add(this.secretKey);
            return arrayList;
        }
    }

    public static final class PigeonUserCredential {
        private PigeonAdditionalUserInfo additionalUserInfo;
        private PigeonAuthCredential credential;
        private PigeonUserDetails user;

        public static final class Builder {
            private PigeonAdditionalUserInfo additionalUserInfo;
            private PigeonAuthCredential credential;
            private PigeonUserDetails user;

            public PigeonUserCredential build() {
                PigeonUserCredential pigeonUserCredential = new PigeonUserCredential();
                pigeonUserCredential.setUser(this.user);
                pigeonUserCredential.setAdditionalUserInfo(this.additionalUserInfo);
                pigeonUserCredential.setCredential(this.credential);
                return pigeonUserCredential;
            }

            public Builder setAdditionalUserInfo(PigeonAdditionalUserInfo pigeonAdditionalUserInfo) {
                this.additionalUserInfo = pigeonAdditionalUserInfo;
                return this;
            }

            public Builder setCredential(PigeonAuthCredential pigeonAuthCredential) {
                this.credential = pigeonAuthCredential;
                return this;
            }

            public Builder setUser(PigeonUserDetails pigeonUserDetails) {
                this.user = pigeonUserDetails;
                return this;
            }
        }

        public static PigeonUserCredential fromList(ArrayList<Object> arrayList) {
            PigeonUserCredential pigeonUserCredential = new PigeonUserCredential();
            pigeonUserCredential.setUser((PigeonUserDetails) arrayList.get(0));
            pigeonUserCredential.setAdditionalUserInfo((PigeonAdditionalUserInfo) arrayList.get(1));
            pigeonUserCredential.setCredential((PigeonAuthCredential) arrayList.get(2));
            return pigeonUserCredential;
        }

        public PigeonAdditionalUserInfo getAdditionalUserInfo() {
            return this.additionalUserInfo;
        }

        public PigeonAuthCredential getCredential() {
            return this.credential;
        }

        public PigeonUserDetails getUser() {
            return this.user;
        }

        public void setAdditionalUserInfo(PigeonAdditionalUserInfo pigeonAdditionalUserInfo) {
            this.additionalUserInfo = pigeonAdditionalUserInfo;
        }

        public void setCredential(PigeonAuthCredential pigeonAuthCredential) {
            this.credential = pigeonAuthCredential;
        }

        public void setUser(PigeonUserDetails pigeonUserDetails) {
            this.user = pigeonUserDetails;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.user);
            arrayList.add(this.additionalUserInfo);
            arrayList.add(this.credential);
            return arrayList;
        }
    }

    public static final class PigeonUserDetails {
        private List<Map<Object, Object>> providerData;
        private PigeonUserInfo userInfo;

        public static final class Builder {
            private List<Map<Object, Object>> providerData;
            private PigeonUserInfo userInfo;

            public PigeonUserDetails build() {
                PigeonUserDetails pigeonUserDetails = new PigeonUserDetails();
                pigeonUserDetails.setUserInfo(this.userInfo);
                pigeonUserDetails.setProviderData(this.providerData);
                return pigeonUserDetails;
            }

            public Builder setProviderData(List<Map<Object, Object>> list) {
                this.providerData = list;
                return this;
            }

            public Builder setUserInfo(PigeonUserInfo pigeonUserInfo) {
                this.userInfo = pigeonUserInfo;
                return this;
            }
        }

        public static PigeonUserDetails fromList(ArrayList<Object> arrayList) {
            PigeonUserDetails pigeonUserDetails = new PigeonUserDetails();
            pigeonUserDetails.setUserInfo((PigeonUserInfo) arrayList.get(0));
            pigeonUserDetails.setProviderData((List) arrayList.get(1));
            return pigeonUserDetails;
        }

        public List<Map<Object, Object>> getProviderData() {
            return this.providerData;
        }

        public PigeonUserInfo getUserInfo() {
            return this.userInfo;
        }

        public void setProviderData(List<Map<Object, Object>> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"providerData\" is null.");
            }
            this.providerData = list;
        }

        public void setUserInfo(PigeonUserInfo pigeonUserInfo) {
            if (pigeonUserInfo == null) {
                throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
            }
            this.userInfo = pigeonUserInfo;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.userInfo);
            arrayList.add(this.providerData);
            return arrayList;
        }
    }

    public static final class PigeonUserInfo {
        private Long creationTimestamp;
        private String displayName;
        private String email;
        private Boolean isAnonymous;
        private Boolean isEmailVerified;
        private Long lastSignInTimestamp;
        private String phoneNumber;
        private String photoUrl;
        private String providerId;
        private String refreshToken;
        private String tenantId;
        private String uid;

        public static final class Builder {
            private Long creationTimestamp;
            private String displayName;
            private String email;
            private Boolean isAnonymous;
            private Boolean isEmailVerified;
            private Long lastSignInTimestamp;
            private String phoneNumber;
            private String photoUrl;
            private String providerId;
            private String refreshToken;
            private String tenantId;
            private String uid;

            public PigeonUserInfo build() {
                PigeonUserInfo pigeonUserInfo = new PigeonUserInfo();
                pigeonUserInfo.setUid(this.uid);
                pigeonUserInfo.setEmail(this.email);
                pigeonUserInfo.setDisplayName(this.displayName);
                pigeonUserInfo.setPhotoUrl(this.photoUrl);
                pigeonUserInfo.setPhoneNumber(this.phoneNumber);
                pigeonUserInfo.setIsAnonymous(this.isAnonymous);
                pigeonUserInfo.setIsEmailVerified(this.isEmailVerified);
                pigeonUserInfo.setProviderId(this.providerId);
                pigeonUserInfo.setTenantId(this.tenantId);
                pigeonUserInfo.setRefreshToken(this.refreshToken);
                pigeonUserInfo.setCreationTimestamp(this.creationTimestamp);
                pigeonUserInfo.setLastSignInTimestamp(this.lastSignInTimestamp);
                return pigeonUserInfo;
            }

            public Builder setCreationTimestamp(Long l10) {
                this.creationTimestamp = l10;
                return this;
            }

            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            public Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            public Builder setIsAnonymous(Boolean bool) {
                this.isAnonymous = bool;
                return this;
            }

            public Builder setIsEmailVerified(Boolean bool) {
                this.isEmailVerified = bool;
                return this;
            }

            public Builder setLastSignInTimestamp(Long l10) {
                this.lastSignInTimestamp = l10;
                return this;
            }

            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
                return this;
            }

            public Builder setPhotoUrl(String str) {
                this.photoUrl = str;
                return this;
            }

            public Builder setProviderId(String str) {
                this.providerId = str;
                return this;
            }

            public Builder setRefreshToken(String str) {
                this.refreshToken = str;
                return this;
            }

            public Builder setTenantId(String str) {
                this.tenantId = str;
                return this;
            }

            public Builder setUid(String str) {
                this.uid = str;
                return this;
            }
        }

        public static PigeonUserInfo fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonUserInfo pigeonUserInfo = new PigeonUserInfo();
            pigeonUserInfo.setUid((String) arrayList.get(0));
            pigeonUserInfo.setEmail((String) arrayList.get(1));
            pigeonUserInfo.setDisplayName((String) arrayList.get(2));
            pigeonUserInfo.setPhotoUrl((String) arrayList.get(3));
            pigeonUserInfo.setPhoneNumber((String) arrayList.get(4));
            pigeonUserInfo.setIsAnonymous((Boolean) arrayList.get(5));
            pigeonUserInfo.setIsEmailVerified((Boolean) arrayList.get(6));
            pigeonUserInfo.setProviderId((String) arrayList.get(7));
            pigeonUserInfo.setTenantId((String) arrayList.get(8));
            pigeonUserInfo.setRefreshToken((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonUserInfo.setCreationTimestamp(valueOf);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                l10 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonUserInfo.setLastSignInTimestamp(l10);
            return pigeonUserInfo;
        }

        public Long getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getEmail() {
            return this.email;
        }

        public Boolean getIsAnonymous() {
            return this.isAnonymous;
        }

        public Boolean getIsEmailVerified() {
            return this.isEmailVerified;
        }

        public Long getLastSignInTimestamp() {
            return this.lastSignInTimestamp;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public String getProviderId() {
            return this.providerId;
        }

        public String getRefreshToken() {
            return this.refreshToken;
        }

        public String getTenantId() {
            return this.tenantId;
        }

        public String getUid() {
            return this.uid;
        }

        public void setCreationTimestamp(Long l10) {
            this.creationTimestamp = l10;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setIsAnonymous(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
            }
            this.isAnonymous = bool;
        }

        public void setIsEmailVerified(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
            }
            this.isEmailVerified = bool;
        }

        public void setLastSignInTimestamp(Long l10) {
            this.lastSignInTimestamp = l10;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setPhotoUrl(String str) {
            this.photoUrl = str;
        }

        public void setProviderId(String str) {
            this.providerId = str;
        }

        public void setRefreshToken(String str) {
            this.refreshToken = str;
        }

        public void setTenantId(String str) {
            this.tenantId = str;
        }

        public void setUid(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.uid = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.uid);
            arrayList.add(this.email);
            arrayList.add(this.displayName);
            arrayList.add(this.photoUrl);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.isAnonymous);
            arrayList.add(this.isEmailVerified);
            arrayList.add(this.providerId);
            arrayList.add(this.tenantId);
            arrayList.add(this.refreshToken);
            arrayList.add(this.creationTimestamp);
            arrayList.add(this.lastSignInTimestamp);
            return arrayList;
        }
    }

    public static final class PigeonUserProfile {
        private String displayName;
        private Boolean displayNameChanged;
        private String photoUrl;
        private Boolean photoUrlChanged;

        public static final class Builder {
            private String displayName;
            private Boolean displayNameChanged;
            private String photoUrl;
            private Boolean photoUrlChanged;

            public PigeonUserProfile build() {
                PigeonUserProfile pigeonUserProfile = new PigeonUserProfile();
                pigeonUserProfile.setDisplayName(this.displayName);
                pigeonUserProfile.setPhotoUrl(this.photoUrl);
                pigeonUserProfile.setDisplayNameChanged(this.displayNameChanged);
                pigeonUserProfile.setPhotoUrlChanged(this.photoUrlChanged);
                return pigeonUserProfile;
            }

            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            public Builder setDisplayNameChanged(Boolean bool) {
                this.displayNameChanged = bool;
                return this;
            }

            public Builder setPhotoUrl(String str) {
                this.photoUrl = str;
                return this;
            }

            public Builder setPhotoUrlChanged(Boolean bool) {
                this.photoUrlChanged = bool;
                return this;
            }
        }

        public static PigeonUserProfile fromList(ArrayList<Object> arrayList) {
            PigeonUserProfile pigeonUserProfile = new PigeonUserProfile();
            pigeonUserProfile.setDisplayName((String) arrayList.get(0));
            pigeonUserProfile.setPhotoUrl((String) arrayList.get(1));
            pigeonUserProfile.setDisplayNameChanged((Boolean) arrayList.get(2));
            pigeonUserProfile.setPhotoUrlChanged((Boolean) arrayList.get(3));
            return pigeonUserProfile;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public Boolean getDisplayNameChanged() {
            return this.displayNameChanged;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public Boolean getPhotoUrlChanged() {
            return this.photoUrlChanged;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setDisplayNameChanged(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
            }
            this.displayNameChanged = bool;
        }

        public void setPhotoUrl(String str) {
            this.photoUrl = str;
        }

        public void setPhotoUrlChanged(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
            }
            this.photoUrlChanged = bool;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.displayName);
            arrayList.add(this.photoUrl);
            arrayList.add(this.displayNameChanged);
            arrayList.add(this.photoUrlChanged);
            return arrayList;
        }
    }

    public static final class PigeonVerifyPhoneNumberRequest {
        private String autoRetrievedSmsCodeForTesting;
        private Long forceResendingToken;
        private String multiFactorInfoId;
        private String multiFactorSessionId;
        private String phoneNumber;
        private Long timeout;

        public static final class Builder {
            private String autoRetrievedSmsCodeForTesting;
            private Long forceResendingToken;
            private String multiFactorInfoId;
            private String multiFactorSessionId;
            private String phoneNumber;
            private Long timeout;

            public PigeonVerifyPhoneNumberRequest build() {
                PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
                pigeonVerifyPhoneNumberRequest.setPhoneNumber(this.phoneNumber);
                pigeonVerifyPhoneNumberRequest.setTimeout(this.timeout);
                pigeonVerifyPhoneNumberRequest.setForceResendingToken(this.forceResendingToken);
                pigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting(this.autoRetrievedSmsCodeForTesting);
                pigeonVerifyPhoneNumberRequest.setMultiFactorInfoId(this.multiFactorInfoId);
                pigeonVerifyPhoneNumberRequest.setMultiFactorSessionId(this.multiFactorSessionId);
                return pigeonVerifyPhoneNumberRequest;
            }

            public Builder setAutoRetrievedSmsCodeForTesting(String str) {
                this.autoRetrievedSmsCodeForTesting = str;
                return this;
            }

            public Builder setForceResendingToken(Long l10) {
                this.forceResendingToken = l10;
                return this;
            }

            public Builder setMultiFactorInfoId(String str) {
                this.multiFactorInfoId = str;
                return this;
            }

            public Builder setMultiFactorSessionId(String str) {
                this.multiFactorSessionId = str;
                return this;
            }

            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
                return this;
            }

            public Builder setTimeout(Long l10) {
                this.timeout = l10;
                return this;
            }
        }

        public static PigeonVerifyPhoneNumberRequest fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
            pigeonVerifyPhoneNumberRequest.setPhoneNumber((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pigeonVerifyPhoneNumberRequest.setTimeout(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                l10 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pigeonVerifyPhoneNumberRequest.setForceResendingToken(l10);
            pigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting((String) arrayList.get(3));
            pigeonVerifyPhoneNumberRequest.setMultiFactorInfoId((String) arrayList.get(4));
            pigeonVerifyPhoneNumberRequest.setMultiFactorSessionId((String) arrayList.get(5));
            return pigeonVerifyPhoneNumberRequest;
        }

        public String getAutoRetrievedSmsCodeForTesting() {
            return this.autoRetrievedSmsCodeForTesting;
        }

        public Long getForceResendingToken() {
            return this.forceResendingToken;
        }

        public String getMultiFactorInfoId() {
            return this.multiFactorInfoId;
        }

        public String getMultiFactorSessionId() {
            return this.multiFactorSessionId;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public Long getTimeout() {
            return this.timeout;
        }

        public void setAutoRetrievedSmsCodeForTesting(String str) {
            this.autoRetrievedSmsCodeForTesting = str;
        }

        public void setForceResendingToken(Long l10) {
            this.forceResendingToken = l10;
        }

        public void setMultiFactorInfoId(String str) {
            this.multiFactorInfoId = str;
        }

        public void setMultiFactorSessionId(String str) {
            this.multiFactorSessionId = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setTimeout(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"timeout\" is null.");
            }
            this.timeout = l10;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.timeout);
            arrayList.add(this.forceResendingToken);
            arrayList.add(this.autoRetrievedSmsCodeForTesting);
            arrayList.add(this.multiFactorInfoId);
            arrayList.add(this.multiFactorSessionId);
            return arrayList;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public interface VoidResult {
        void error(Throwable th);

        void success();
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            obj = flutterError.details;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
