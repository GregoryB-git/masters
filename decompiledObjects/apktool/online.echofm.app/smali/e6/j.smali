.class public Le6/j;
.super Le6/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le6/i;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final h(Ljava/io/File;Le6/f;)Le6/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "direction"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Le6/e;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Le6/e;-><init>(Ljava/io/File;Le6/f;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final i(Ljava/io/File;)Le6/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Le6/f;->p:Le6/f;

    .line 7
    .line 8
    invoke-static {p0, v0}, Le6/j;->h(Ljava/io/File;Le6/f;)Le6/e;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
