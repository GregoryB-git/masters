package io.flutter.plugins.sharedpreferences;

import b.z;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface SharedPreferencesAsyncApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final rb.c<SharedPreferencesAsyncApiCodec> codec$delegate = z.n(new bb.c(1));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$11$lambda$10(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List<String> list2 = (List) obj3;
            Object obj4 = list.get(2);
            ec.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setStringList(str, list2, (SharedPreferencesPigeonOptions) obj4);
                wrapError = va.a.f(null);
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$13$lambda$12(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = va.a.f(sharedPreferencesAsyncApi.getString(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$15$lambda$14(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = va.a.f(sharedPreferencesAsyncApi.getBool(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$17$lambda$16(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = va.a.f(sharedPreferencesAsyncApi.getDouble(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$19$lambda$18(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = va.a.f(sharedPreferencesAsyncApi.getInt(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$lambda$1(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            ec.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setBool(str, booleanValue, (SharedPreferencesPigeonOptions) obj4);
                wrapError = va.a.f(null);
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$21$lambda$20(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = va.a.f(sharedPreferencesAsyncApi.getStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$23$lambda$22(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            ec.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.clear(list2, (SharedPreferencesPigeonOptions) obj2);
                wrapError = va.a.f(null);
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$25$lambda$24(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            ec.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = va.a.f(sharedPreferencesAsyncApi.getAll(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$27$lambda$26(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            ec.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                wrapError = va.a.f(sharedPreferencesAsyncApi.getKeys(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$lambda$3(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            ec.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setString(str, str2, (SharedPreferencesPigeonOptions) obj4);
                wrapError = va.a.f(null);
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$7$lambda$6(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            long longValue;
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            if (obj3 instanceof Integer) {
                longValue = ((Number) obj3).intValue();
            } else {
                ec.i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((Long) obj3).longValue();
            }
            Object obj4 = list.get(2);
            ec.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setInt(str, longValue, (SharedPreferencesPigeonOptions) obj4);
                wrapError = va.a.f(null);
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$lambda$8(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List wrapError;
            ec.i.e(reply, "reply");
            ec.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ec.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            ec.i.c(obj3, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            ec.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDouble(str, doubleValue, (SharedPreferencesPigeonOptions) obj4);
                wrapError = va.a.f(null);
            } catch (Throwable th) {
                wrapError = MessagesAsync_gKt.wrapError(th);
            }
            reply.reply(wrapError);
        }

        public final MessageCodec<Object> getCodec() {
            return codec$delegate.getValue();
        }

        public final void setUp(BinaryMessenger binaryMessenger, final SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
            ec.i.e(binaryMessenger, "binaryMessenger");
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            final int i10 = 0;
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$lambda$12(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$21$lambda$20(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            final int i11 = 1;
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$lambda$12(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$21$lambda$20(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$23$lambda$22(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$lambda$6(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$15$lambda$14(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$25$lambda$24(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$lambda$8(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$17$lambda$16(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i11) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$27$lambda$26(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$lambda$10(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$19$lambda$18(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", getCodec());
            final int i12 = 2;
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$lambda$12(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$21$lambda$20(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", getCodec());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$23$lambda$22(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$lambda$6(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$15$lambda$14(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", getCodec());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$25$lambda$24(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$lambda$8(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$17$lambda$16(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", getCodec());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i12) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$27$lambda$26(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$lambda$10(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$19$lambda$18(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", getCodec());
            if (sharedPreferencesAsyncApi != null) {
                final int i13 = 3;
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i13) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$lambda$12(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$21$lambda$20(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$23$lambda$22(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$7$lambda$6(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$15$lambda$14(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$25$lambda$24(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$9$lambda$8(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$17$lambda$16(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesAsyncApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        switch (i10) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$27$lambda$26(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$lambda$10(sharedPreferencesAsyncApi, obj, reply);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$19$lambda$18(sharedPreferencesAsyncApi, obj, reply);
                                break;
                        }
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
        }
    }

    void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setBool(String str, boolean z10, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDouble(String str, double d10, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setInt(String str, long j10, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);
}
