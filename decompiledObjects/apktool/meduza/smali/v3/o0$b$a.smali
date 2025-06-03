.class public final Lv3/o0$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lv3/o0$b$a;->b:J

    return-void
.end method

.method public constructor <init>(Lv3/o0$c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lv3/o0$b;->a:J

    iput-wide v0, p0, Lv3/o0$b$a;->a:J

    iget-wide v0, p1, Lv3/o0$b;->b:J

    iput-wide v0, p0, Lv3/o0$b$a;->b:J

    iget-boolean v0, p1, Lv3/o0$b;->c:Z

    iput-boolean v0, p0, Lv3/o0$b$a;->c:Z

    iget-boolean v0, p1, Lv3/o0$b;->d:Z

    iput-boolean v0, p0, Lv3/o0$b$a;->d:Z

    iget-boolean p1, p1, Lv3/o0$b;->e:Z

    iput-boolean p1, p0, Lv3/o0$b$a;->e:Z

    return-void
.end method
