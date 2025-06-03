.class public LV3/x$q;
.super LV3/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "q"
.end annotation


# instance fields
.field public d:La4/i;


# direct methods
.method public constructor <init>(La4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LV3/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/x$q;->d:La4/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(La4/i;)LV3/h;
    .locals 1

    .line 1
    new-instance v0, LV3/x$q;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LV3/x$q;-><init>(La4/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b(La4/c;La4/i;)La4/d;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public c(LQ3/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(La4/d;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e()La4/i;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/x$q;->d:La4/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LV3/x$q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LV3/x$q;

    .line 6
    .line 7
    iget-object p1, p1, LV3/x$q;->d:La4/i;

    .line 8
    .line 9
    iget-object v0, p0, LV3/x$q;->d:La4/i;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, La4/i;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return p1
.end method

.method public f(LV3/h;)Z
    .locals 0

    .line 1
    instance-of p1, p1, LV3/x$q;

    .line 2
    .line 3
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LV3/x$q;->d:La4/i;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/i;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i(La4/e$a;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method
