.class public LS3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS3/h;


# static fields
.field public static final a:LS3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LS3/g;

    .line 2
    .line 3
    invoke-direct {v0}, LS3/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LS3/g;->a:LS3/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j()LS3/g;
    .locals 1

    .line 1
    sget-object v0, LS3/g;->a:LS3/g;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a()LS3/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)LS3/h;
    .locals 0

    .line 1
    new-instance p3, LS3/i;

    .line 2
    .line 3
    invoke-direct {p3, p1, p2}, LS3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object p3
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;LS3/h$a;LS3/h;LS3/h;)LS3/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public d()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public e(LS3/h$b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f()LS3/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public g(Ljava/lang/Object;Ljava/util/Comparator;)LS3/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public h()LS3/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public i()LS3/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public size()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
