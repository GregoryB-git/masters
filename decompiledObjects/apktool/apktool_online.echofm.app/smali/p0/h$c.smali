.class public Lp0/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/F$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lp0/h;


# direct methods
.method public constructor <init>(Lp0/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp0/h$c;->a:Lp0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp0/h;Lp0/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lp0/h$c;-><init>(Lp0/h;)V

    return-void
.end method


# virtual methods
.method public a(Lp0/F;[BII[B)V
    .locals 0

    .line 1
    iget-object p1, p0, Lp0/h$c;->a:Lp0/h;

    .line 2
    .line 3
    iget-object p1, p1, Lp0/h;->y:Lp0/h$d;

    .line 4
    .line 5
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lp0/h$d;

    .line 10
    .line 11
    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
