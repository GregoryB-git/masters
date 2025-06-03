.class public abstract Lr0/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:Lr0/f$d;

.field public final q:J

.field public final r:I

.field public final s:J

.field public final t:Ld0/m;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:J

.field public final x:J

.field public final y:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lr0/f$d;JIJLd0/m;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/f$e;->o:Ljava/lang/String;

    iput-object p2, p0, Lr0/f$e;->p:Lr0/f$d;

    iput-wide p3, p0, Lr0/f$e;->q:J

    iput p5, p0, Lr0/f$e;->r:I

    iput-wide p6, p0, Lr0/f$e;->s:J

    iput-object p8, p0, Lr0/f$e;->t:Ld0/m;

    iput-object p9, p0, Lr0/f$e;->u:Ljava/lang/String;

    iput-object p10, p0, Lr0/f$e;->v:Ljava/lang/String;

    iput-wide p11, p0, Lr0/f$e;->w:J

    iput-wide p13, p0, Lr0/f$e;->x:J

    iput-boolean p15, p0, Lr0/f$e;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lr0/f$d;JIJLd0/m;Ljava/lang/String;Ljava/lang/String;JJZLr0/f$a;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p15}, Lr0/f$e;-><init>(Ljava/lang/String;Lr0/f$d;JIJLd0/m;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Long;)I
    .locals 4

    .line 1
    iget-wide v0, p0, Lr0/f$e;->s:J

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v0, p0, Lr0/f$e;->s:J

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr0/f$e;->c(Ljava/lang/Long;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
