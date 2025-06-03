.class public final Lb1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/e$a;
    }
.end annotation


# instance fields
.field public final a:Lb1/d;

.field public final b:Lb1/m;


# direct methods
.method public constructor <init>(Lb1/d;Lb1/m;)V
    .locals 1

    const-string v0, "defaultLifecycleObserver"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/e;->a:Lb1/d;

    iput-object p2, p0, Lb1/e;->b:Lb1/m;

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 2

    sget-object v0, Lb1/e$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ON_ANY must not been send by anybody"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iget-object v0, p0, Lb1/e;->a:Lb1/d;

    invoke-interface {v0, p1}, Lb1/d;->onDestroy(Lb1/o;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lb1/e;->a:Lb1/d;

    invoke-interface {v0, p1}, Lb1/d;->onStop(Lb1/o;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lb1/e;->a:Lb1/d;

    invoke-interface {v0, p1}, Lb1/d;->onPause(Lb1/o;)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lb1/e;->a:Lb1/d;

    invoke-interface {v0, p1}, Lb1/d;->onResume(Lb1/o;)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lb1/e;->a:Lb1/d;

    invoke-interface {v0, p1}, Lb1/d;->onStart(Lb1/o;)V

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lb1/e;->a:Lb1/d;

    invoke-interface {v0, p1}, Lb1/d;->onCreate(Lb1/o;)V

    :goto_0
    iget-object v0, p0, Lb1/e;->b:Lb1/m;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lb1/m;->a(Lb1/o;Lb1/k$a;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
