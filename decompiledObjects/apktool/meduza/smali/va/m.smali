.class public final synthetic Lva/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic c:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic d:Lva/d;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lva/d;I)V
    .locals 0

    iput p4, p0, Lva/m;->a:I

    iput-object p1, p0, Lva/m;->b:Lio/flutter/plugin/common/MethodCall;

    iput-object p2, p0, Lva/m;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p3, p0, Lva/m;->d:Lva/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lva/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lva/m;->b:Lio/flutter/plugin/common/MethodCall;

    .line 8
    .line 9
    iget-object v1, p0, Lva/m;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 10
    .line 11
    iget-object v2, p0, Lva/m;->d:Lva/d;

    .line 12
    .line 13
    sget-object v3, Lva/s;->c:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v3, Lwa/c;

    .line 16
    .line 17
    invoke-direct {v3, v0, v1}, Lwa/c;-><init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lg/q;

    .line 24
    .line 25
    const/16 v1, 0x19

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3, v0}, Lva/d;->l(Lwa/c;Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :goto_0
    iget-object v0, p0, Lva/m;->b:Lio/flutter/plugin/common/MethodCall;

    .line 35
    .line 36
    iget-object v1, p0, Lva/m;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 37
    .line 38
    iget-object v2, p0, Lva/m;->d:Lva/d;

    .line 39
    .line 40
    sget-object v3, Lva/s;->c:Ljava/util/HashMap;

    .line 41
    .line 42
    new-instance v3, Lwa/c;

    .line 43
    .line 44
    invoke-direct {v3, v0, v1}, Lwa/c;-><init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, Lx0/f;

    .line 51
    .line 52
    const/16 v1, 0x17

    .line 53
    .line 54
    invoke-direct {v0, v1, v2, v3}, Lx0/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3, v0}, Lva/d;->l(Lwa/c;Ljava/lang/Runnable;)V

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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
