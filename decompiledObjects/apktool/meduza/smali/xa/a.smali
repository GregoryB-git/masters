.class public final synthetic Lxa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;I)V
    .locals 0

    iput p3, p0, Lxa/a;->a:I

    iput-object p1, p0, Lxa/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lxa/a;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 4

    .line 1
    iget v0, p0, Lxa/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :pswitch_0
    iget-object v0, p0, Lxa/a;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lxa/b;

    .line 10
    .line 11
    iget-object v1, p0, Lxa/a;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-string v3, "InAppReviewPlugin"

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const-string v2, "onComplete: Successfully requested review flow"

    .line 25
    .line 26
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lj7/b;

    .line 34
    .line 35
    iput-object p1, v0, Lxa/b;->d:Lj7/b;

    .line 36
    .line 37
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string p1, "onComplete: Unsuccessfully requested review flow"

    .line 41
    .line 42
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    :goto_0
    invoke-interface {v1, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_1
    iget-object v0, p0, Lxa/a;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lio/flutter/plugins/firebase/functions/FlutterFirebaseFunctionsPlugin;

    .line 54
    .line 55
    iget-object v1, p0, Lxa/a;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 56
    .line 57
    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/functions/FlutterFirebaseFunctionsPlugin;->c(Lio/flutter/plugins/firebase/functions/FlutterFirebaseFunctionsPlugin;Lio/flutter/plugin/common/MethodChannel$Result;Lcom/google/android/gms/tasks/Task;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
