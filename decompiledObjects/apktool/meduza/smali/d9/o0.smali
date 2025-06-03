.class public final synthetic Ld9/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ld9/o0;->a:I

    iput-object p2, p0, Ld9/o0;->b:Ljava/lang/Object;

    iput-object p3, p0, Ld9/o0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V
    .locals 5

    .line 1
    iget v0, p0, Ld9/o0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_2

    .line 7
    :pswitch_0
    iget-object v0, p0, Ld9/o0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/firebase/firestore/i;

    .line 10
    .line 11
    iget-object v1, p0, Ld9/o0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ld9/l;

    .line 14
    .line 15
    check-cast p1, Lg9/s0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1, v2, p2}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 p2, 0x0

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v3, p2

    .line 33
    :goto_0
    new-array p2, p2, [Ljava/lang/Object;

    .line 34
    .line 35
    const-string v4, "Got event without value or error set"

    .line 36
    .line 37
    invoke-static {v4, v3, p2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p2, Lcom/google/firebase/firestore/k;

    .line 41
    .line 42
    iget-object v3, v0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 43
    .line 44
    invoke-direct {p2, v0, p1, v3}, Lcom/google/firebase/firestore/k;-><init>(Lcom/google/firebase/firestore/i;Lg9/s0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, p2, v2}, Ld9/l;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    return-void

    .line 51
    :goto_2
    iget-object v0, p0, Ld9/o0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;

    .line 54
    .line 55
    iget-object v1, p0, Ld9/o0;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 58
    .line 59
    check-cast p1, Lcom/google/firebase/firestore/k;

    .line 60
    .line 61
    invoke-static {v0, v1, p1, p2}, Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;->a(Lio/flutter/plugins/firebase/firestore/streamhandler/QuerySnapshotsStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lcom/google/firebase/firestore/k;Lcom/google/firebase/firestore/f;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
