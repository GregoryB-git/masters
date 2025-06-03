.class public final Lv3/o0$e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lv3/o0$e$a;->a:J

    iput-wide v0, p0, Lv3/o0$e$a;->b:J

    iput-wide v0, p0, Lv3/o0$e$a;->c:J

    const v0, -0x800001

    iput v0, p0, Lv3/o0$e$a;->d:F

    iput v0, p0, Lv3/o0$e$a;->e:F

    return-void
.end method

.method public constructor <init>(Lv3/o0$e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lv3/o0$e;->a:J

    iput-wide v0, p0, Lv3/o0$e$a;->a:J

    iget-wide v0, p1, Lv3/o0$e;->b:J

    iput-wide v0, p0, Lv3/o0$e$a;->b:J

    iget-wide v0, p1, Lv3/o0$e;->c:J

    iput-wide v0, p0, Lv3/o0$e$a;->c:J

    iget v0, p1, Lv3/o0$e;->d:F

    iput v0, p0, Lv3/o0$e$a;->d:F

    iget p1, p1, Lv3/o0$e;->e:F

    iput p1, p0, Lv3/o0$e$a;->e:F

    return-void
.end method
