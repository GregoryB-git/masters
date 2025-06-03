package io.flutter.plugins.googlesignin;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.googlesignin.Messages;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Messages {

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public interface GoogleSignInApi {

        /* renamed from: io.flutter.plugins.googlesignin.Messages$GoogleSignInApi$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static MessageCodec<Object> a() {
                return GoogleSignInApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    googleSignInApi.init((InitParams) ((ArrayList) obj).get(0));
                    arrayList.add(0, null);
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void c(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.signInSilently(new Result<UserData>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.1
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(UserData userData) {
                        arrayList.add(0, userData);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.signIn(new Result<UserData>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.2
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(UserData userData) {
                        arrayList.add(0, userData);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                googleSignInApi.getAccessToken((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.3
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.signOut(new Result<Void>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.4
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.disconnect(new Result<Void>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.5
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, googleSignInApi.isSignedIn());
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void i(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.clearAuthCache((String) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.6
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void j(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.requestScopes((List) ((ArrayList) obj).get(0), new Result<Boolean>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.7
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(Boolean bool) {
                        arrayList.add(0, bool);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void k(BinaryMessenger binaryMessenger, final GoogleSignInApi googleSignInApi) {
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.init", a());
                final int i10 = 0;
                if (googleSignInApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.d
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    break;
                                case 1:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.signInSilently", a());
                if (googleSignInApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.signIn", a());
                if (googleSignInApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.getAccessToken", a());
                if (googleSignInApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i10) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.signOut", a());
                final int i11 = 1;
                if (googleSignInApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.d
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    break;
                                case 1:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.disconnect", a());
                if (googleSignInApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.e
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.isSignedIn", a());
                if (googleSignInApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.f
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.clearAuthCache", a());
                if (googleSignInApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.g
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i11) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.GoogleSignInApi.requestScopes", a());
                if (googleSignInApi == null) {
                    basicMessageChannel9.setMessageHandler(null);
                } else {
                    final int i12 = 2;
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.googlesignin.d
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (i12) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    break;
                                case 1:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    break;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    break;
                            }
                        }
                    });
                }
            }
        }

        void clearAuthCache(String str, Result<Void> result);

        void disconnect(Result<Void> result);

        void getAccessToken(String str, Boolean bool, Result<String> result);

        void init(InitParams initParams);

        Boolean isSignedIn();

        void requestScopes(List<String> list, Result<Boolean> result);

        void signIn(Result<UserData> result);

        void signInSilently(Result<UserData> result);

        void signOut(Result<Void> result);
    }

    public static class GoogleSignInApiCodec extends StandardMessageCodec {
        public static final GoogleSignInApiCodec INSTANCE = new GoogleSignInApiCodec();

        private GoogleSignInApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.readValueOfType(b10, byteBuffer) : UserData.fromList((ArrayList) readValue(byteBuffer)) : InitParams.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof InitParams) {
                byteArrayOutputStream.write(128);
                list = ((InitParams) obj).toList();
            } else if (!(obj instanceof UserData)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                list = ((UserData) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    public static final class InitParams {
        private String clientId;
        private Boolean forceCodeForRefreshToken;
        private String hostedDomain;
        private List<String> scopes;
        private String serverClientId;
        private SignInType signInType;

        public static final class Builder {
            private String clientId;
            private Boolean forceCodeForRefreshToken;
            private String hostedDomain;
            private List<String> scopes;
            private String serverClientId;
            private SignInType signInType;

            public InitParams build() {
                InitParams initParams = new InitParams();
                initParams.setScopes(this.scopes);
                initParams.setSignInType(this.signInType);
                initParams.setHostedDomain(this.hostedDomain);
                initParams.setClientId(this.clientId);
                initParams.setServerClientId(this.serverClientId);
                initParams.setForceCodeForRefreshToken(this.forceCodeForRefreshToken);
                return initParams;
            }

            public Builder setClientId(String str) {
                this.clientId = str;
                return this;
            }

            public Builder setForceCodeForRefreshToken(Boolean bool) {
                this.forceCodeForRefreshToken = bool;
                return this;
            }

            public Builder setHostedDomain(String str) {
                this.hostedDomain = str;
                return this;
            }

            public Builder setScopes(List<String> list) {
                this.scopes = list;
                return this;
            }

            public Builder setServerClientId(String str) {
                this.serverClientId = str;
                return this;
            }

            public Builder setSignInType(SignInType signInType) {
                this.signInType = signInType;
                return this;
            }
        }

        public static InitParams fromList(ArrayList<Object> arrayList) {
            InitParams initParams = new InitParams();
            initParams.setScopes((List) arrayList.get(0));
            Object obj = arrayList.get(1);
            initParams.setSignInType(obj == null ? null : SignInType.values()[((Integer) obj).intValue()]);
            initParams.setHostedDomain((String) arrayList.get(2));
            initParams.setClientId((String) arrayList.get(3));
            initParams.setServerClientId((String) arrayList.get(4));
            initParams.setForceCodeForRefreshToken((Boolean) arrayList.get(5));
            return initParams;
        }

        public String getClientId() {
            return this.clientId;
        }

        public Boolean getForceCodeForRefreshToken() {
            return this.forceCodeForRefreshToken;
        }

        public String getHostedDomain() {
            return this.hostedDomain;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public String getServerClientId() {
            return this.serverClientId;
        }

        public SignInType getSignInType() {
            return this.signInType;
        }

        public void setClientId(String str) {
            this.clientId = str;
        }

        public void setForceCodeForRefreshToken(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
            }
            this.forceCodeForRefreshToken = bool;
        }

        public void setHostedDomain(String str) {
            this.hostedDomain = str;
        }

        public void setScopes(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"scopes\" is null.");
            }
            this.scopes = list;
        }

        public void setServerClientId(String str) {
            this.serverClientId = str;
        }

        public void setSignInType(SignInType signInType) {
            if (signInType == null) {
                throw new IllegalStateException("Nonnull field \"signInType\" is null.");
            }
            this.signInType = signInType;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.scopes);
            SignInType signInType = this.signInType;
            arrayList.add(signInType == null ? null : Integer.valueOf(signInType.index));
            arrayList.add(this.hostedDomain);
            arrayList.add(this.clientId);
            arrayList.add(this.serverClientId);
            arrayList.add(this.forceCodeForRefreshToken);
            return arrayList;
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t);
    }

    public enum SignInType {
        STANDARD(0),
        GAMES(1);

        public final int index;

        SignInType(int i10) {
            this.index = i10;
        }
    }

    public static final class UserData {
        private String displayName;
        private String email;
        private String id;
        private String idToken;
        private String photoUrl;
        private String serverAuthCode;

        public static final class Builder {
            private String displayName;
            private String email;
            private String id;
            private String idToken;
            private String photoUrl;
            private String serverAuthCode;

            public UserData build() {
                UserData userData = new UserData();
                userData.setDisplayName(this.displayName);
                userData.setEmail(this.email);
                userData.setId(this.id);
                userData.setPhotoUrl(this.photoUrl);
                userData.setIdToken(this.idToken);
                userData.setServerAuthCode(this.serverAuthCode);
                return userData;
            }

            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            public Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            public Builder setId(String str) {
                this.id = str;
                return this;
            }

            public Builder setIdToken(String str) {
                this.idToken = str;
                return this;
            }

            public Builder setPhotoUrl(String str) {
                this.photoUrl = str;
                return this;
            }

            public Builder setServerAuthCode(String str) {
                this.serverAuthCode = str;
                return this;
            }
        }

        public static UserData fromList(ArrayList<Object> arrayList) {
            UserData userData = new UserData();
            userData.setDisplayName((String) arrayList.get(0));
            userData.setEmail((String) arrayList.get(1));
            userData.setId((String) arrayList.get(2));
            userData.setPhotoUrl((String) arrayList.get(3));
            userData.setIdToken((String) arrayList.get(4));
            userData.setServerAuthCode((String) arrayList.get(5));
            return userData;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getEmail() {
            return this.email;
        }

        public String getId() {
            return this.id;
        }

        public String getIdToken() {
            return this.idToken;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public String getServerAuthCode() {
            return this.serverAuthCode;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setEmail(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"email\" is null.");
            }
            this.email = str;
        }

        public void setId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.id = str;
        }

        public void setIdToken(String str) {
            this.idToken = str;
        }

        public void setPhotoUrl(String str) {
            this.photoUrl = str;
        }

        public void setServerAuthCode(String str) {
            this.serverAuthCode = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.displayName);
            arrayList.add(this.email);
            arrayList.add(this.id);
            arrayList.add(this.photoUrl);
            arrayList.add(this.idToken);
            arrayList.add(this.serverAuthCode);
            return arrayList;
        }
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
