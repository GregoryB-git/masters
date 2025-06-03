.class public Ll5/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ll5/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLl5/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/r;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ll5/r;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Ll5/r;->c:J

    .line 9
    .line 10
    iput-object p5, p0, Ll5/r;->d:Ll5/p;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Ll5/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ll5/r;

    .line 7
    .line 8
    iget-object v0, p0, Ll5/r;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p1, Ll5/r;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Ll5/r;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v2, p1, Ll5/r;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-wide v2, p0, Ll5/r;->c:J

    .line 29
    .line 30
    iget-wide v4, p1, Ll5/r;->c:J

    .line 31
    .line 32
    cmp-long v0, v2, v4

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Ll5/r;->d:Ll5/p;

    .line 37
    .line 38
    iget-object p1, p1, Ll5/r;->d:Ll5/p;

    .line 39
    .line 40
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    :cond_0
    return v1
.end method
