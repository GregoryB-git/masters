.class public final Ll8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/n$a;
    }
.end annotation


# instance fields
.field public final a:Ll8/h;

.field public final b:Lk8/i;

.field public c:Ljava/lang/String;

.field public final d:Ll8/n$a;

.field public final e:Ll8/n$a;

.field public final f:Ll8/l;

.field public final g:Ljava/util/concurrent/atomic/AtomicMarkableReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicMarkableReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lp8/e;Lk8/i;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll8/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll8/n$a;-><init>(Ll8/n;Z)V

    iput-object v0, p0, Ll8/n;->d:Ll8/n$a;

    new-instance v0, Ll8/n$a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Ll8/n$a;-><init>(Ll8/n;Z)V

    iput-object v0, p0, Ll8/n;->e:Ll8/n$a;

    new-instance v0, Ll8/l;

    invoke-direct {v0}, Ll8/l;-><init>()V

    iput-object v0, p0, Ll8/n;->f:Ll8/l;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object v0, p0, Ll8/n;->g:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    iput-object p1, p0, Ll8/n;->c:Ljava/lang/String;

    new-instance p1, Ll8/h;

    invoke-direct {p1, p2}, Ll8/h;-><init>(Lp8/e;)V

    iput-object p1, p0, Ll8/n;->a:Ll8/h;

    iput-object p3, p0, Ll8/n;->b:Lk8/i;

    return-void
.end method
