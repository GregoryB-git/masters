.class public final LQ0/b;
.super LO0/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LO0/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(LO0/b;Ljava/nio/ByteBuffer;)Ld0/x;
    .locals 2

    .line 1
    new-instance p1, Ld0/x;

    .line 2
    .line 3
    new-instance v0, Lg0/z;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-direct {v0, v1, p2}, Lg0/z;-><init>([BI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, LQ0/b;->c(Lg0/z;)LQ0/a;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const/4 v0, 0x1

    .line 21
    new-array v0, v0, [Ld0/x$b;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    aput-object p2, v0, v1

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ld0/x;-><init>([Ld0/x$b;)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method

.method public c(Lg0/z;)LQ0/a;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lg0/z;->A()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Lg0/z;->A()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1}, Lg0/z;->z()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual {p1}, Lg0/z;->z()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lg0/z;->f()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p1}, Lg0/z;->g()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {v0, v1, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    new-instance p1, LQ0/a;

    .line 48
    .line 49
    move-object v1, p1

    .line 50
    invoke-direct/range {v1 .. v8}, LQ0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method
