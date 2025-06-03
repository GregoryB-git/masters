.class public final LA0/z;
.super LA0/c;
.source "SourceFile"


# instance fields
.field public final h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/J;II)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, LA0/z;-><init>(Ld0/J;IIILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ld0/J;IIILjava/lang/Object;)V
    .locals 0

    .line 2
    filled-new-array {p2}, [I

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LA0/c;-><init>(Ld0/J;[II)V

    iput p4, p0, LA0/z;->h:I

    iput-object p5, p0, LA0/z;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public n()I
    .locals 1

    .line 1
    iget v0, p0, LA0/z;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public o()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public s()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA0/z;->i:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public v(JJJLjava/util/List;[Ly0/n;)V
    .locals 0

    .line 1
    return-void
.end method
