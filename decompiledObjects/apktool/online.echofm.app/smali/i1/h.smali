.class public final Li1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc1/k;


# instance fields
.field public final o:Li1/c;

.field public final p:[J

.field public final q:Ljava/util/Map;

.field public final r:Ljava/util/Map;

.field public final s:Ljava/util/Map;


# direct methods
.method public constructor <init>(Li1/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1/h;->o:Li1/c;

    .line 5
    .line 6
    iput-object p3, p0, Li1/h;->r:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p4, p0, Li1/h;->s:Ljava/util/Map;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_0
    iput-object p2, p0, Li1/h;->q:Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {p1}, Li1/c;->j()[J

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Li1/h;->p:[J

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public c(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Li1/h;->p:[J

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, p2, v1, v1}, Lg0/M;->d([JJZZ)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object p2, p0, Li1/h;->p:[J

    .line 9
    .line 10
    array-length p2, p2

    .line 11
    if-ge p1, p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    :goto_0
    return p1
.end method

.method public e(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Li1/h;->p:[J

    .line 2
    .line 3
    aget-wide v1, v0, p1

    .line 4
    .line 5
    return-wide v1
.end method

.method public h(J)Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Li1/h;->o:Li1/c;

    .line 2
    .line 3
    iget-object v3, p0, Li1/h;->q:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v4, p0, Li1/h;->r:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v5, p0, Li1/h;->s:Ljava/util/Map;

    .line 8
    .line 9
    move-wide v1, p1

    .line 10
    invoke-virtual/range {v0 .. v5}, Li1/c;->h(JLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, Li1/h;->p:[J

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method
