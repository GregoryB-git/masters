.class public Lf5/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lf5/e$c;

.field public final c:J

.field public final d:I

.field public final e:J

.field public final f:La4/d;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:J

.field public final r:J

.field public final s:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lf5/e$c;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/e$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lf5/e$d;->b:Lf5/e$c;

    iput-wide p3, p0, Lf5/e$d;->c:J

    iput p5, p0, Lf5/e$d;->d:I

    iput-wide p6, p0, Lf5/e$d;->e:J

    iput-object p8, p0, Lf5/e$d;->f:La4/d;

    iput-object p9, p0, Lf5/e$d;->o:Ljava/lang/String;

    iput-object p10, p0, Lf5/e$d;->p:Ljava/lang/String;

    iput-wide p11, p0, Lf5/e$d;->q:J

    iput-wide p13, p0, Lf5/e$d;->r:J

    iput-boolean p15, p0, Lf5/e$d;->s:Z

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Ljava/lang/Long;

    iget-wide v0, p0, Lf5/e$d;->e:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lf5/e$d;->e:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
