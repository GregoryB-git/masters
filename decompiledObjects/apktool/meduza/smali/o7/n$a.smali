.class public final Lo7/n$a;
.super Lo7/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo7/n;-><init>()V

    return-void
.end method

.method public static f(I)Lo7/n;
    .locals 0

    if-gez p0, :cond_0

    sget-object p0, Lo7/n;->b:Lo7/n$b;

    goto :goto_0

    :cond_0
    if-lez p0, :cond_1

    sget-object p0, Lo7/n;->c:Lo7/n$b;

    goto :goto_0

    :cond_1
    sget-object p0, Lo7/n;->a:Lo7/n$a;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final a(II)Lo7/n;
    .locals 0

    if-ge p1, p2, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    if-le p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lo7/n$a;->f(I)Lo7/n;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lo7/n;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lo7/n;"
        }
    .end annotation

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Lo7/n$a;->f(I)Lo7/n;

    move-result-object p1

    return-object p1
.end method

.method public final c(ZZ)Lo7/n;
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    invoke-static {p1}, Lo7/n$a;->f(I)Lo7/n;

    move-result-object p1

    return-object p1
.end method

.method public final d(ZZ)Lo7/n;
    .locals 0

    if-ne p2, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    invoke-static {p1}, Lo7/n$a;->f(I)Lo7/n;

    move-result-object p1

    return-object p1
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
