.class public final Lx0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/x$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/n$a;
    }
.end annotation


# instance fields
.field public final a:Lx0/n$a;

.field public b:Li0/g$a;

.field public c:Lc1/t$a;

.field public d:J

.field public e:J

.field public f:J

.field public g:F

.field public h:F

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LF0/x;)V
    .locals 1

    .line 1
    new-instance v0, Li0/l$a;

    invoke-direct {v0, p1}, Li0/l$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lx0/n;-><init>(Li0/g$a;LF0/x;)V

    return-void
.end method

.method public constructor <init>(Li0/g$a;LF0/x;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/n;->b:Li0/g$a;

    new-instance v0, Lc1/h;

    invoke-direct {v0}, Lc1/h;-><init>()V

    iput-object v0, p0, Lx0/n;->c:Lc1/t$a;

    new-instance v1, Lx0/n$a;

    invoke-direct {v1, p2, v0}, Lx0/n$a;-><init>(LF0/x;Lc1/t$a;)V

    iput-object v1, p0, Lx0/n;->a:Lx0/n$a;

    invoke-virtual {v1, p1}, Lx0/n$a;->a(Li0/g$a;)V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lx0/n;->d:J

    iput-wide p1, p0, Lx0/n;->e:J

    iput-wide p1, p0, Lx0/n;->f:J

    const p1, -0x800001

    iput p1, p0, Lx0/n;->g:F

    iput p1, p0, Lx0/n;->h:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx0/n;->i:Z

    return-void
.end method
