.class public La0/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:La0/f;

.field public final e:Landroid/os/Bundle;

.field public final f:La0/d$o;

.field public final g:Ljava/util/HashMap;

.field public h:La0/d$e;

.field public final synthetic i:La0/d;


# direct methods
.method public constructor <init>(La0/d;Ljava/lang/String;IILandroid/os/Bundle;La0/d$o;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$f;->i:La0/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La0/d$f;->g:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object p2, p0, La0/d$f;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput p3, p0, La0/d$f;->b:I

    .line 16
    .line 17
    iput p4, p0, La0/d$f;->c:I

    .line 18
    .line 19
    new-instance p1, La0/f;

    .line 20
    .line 21
    invoke-direct {p1, p2, p3, p4}, La0/f;-><init>(Ljava/lang/String;II)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La0/d$f;->d:La0/f;

    .line 25
    .line 26
    iput-object p5, p0, La0/d$f;->e:Landroid/os/Bundle;

    .line 27
    .line 28
    iput-object p6, p0, La0/d$f;->f:La0/d$o;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    .line 1
    iget-object v0, p0, La0/d$f;->i:La0/d;

    .line 2
    .line 3
    iget-object v0, v0, La0/d;->u:La0/d$q;

    .line 4
    .line 5
    new-instance v1, La0/d$f$a;

    .line 6
    .line 7
    invoke-direct {v1, p0}, La0/d$f$a;-><init>(La0/d$f;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
