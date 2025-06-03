.class public abstract LX2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/n$b;
    }
.end annotation


# static fields
.field public static final a:LX2/n;

.field public static final b:LX2/n;

.field public static final c:LX2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LX2/n$a;

    .line 2
    .line 3
    invoke-direct {v0}, LX2/n$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX2/n;->a:LX2/n;

    .line 7
    .line 8
    new-instance v0, LX2/n$b;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, LX2/n$b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LX2/n;->b:LX2/n;

    .line 15
    .line 16
    new-instance v0, LX2/n$b;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, LX2/n$b;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, LX2/n;->c:LX2/n;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LX2/n$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX2/n;-><init>()V

    return-void
.end method

.method public static synthetic a()LX2/n;
    .locals 1

    .line 1
    sget-object v0, LX2/n;->b:LX2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b()LX2/n;
    .locals 1

    .line 1
    sget-object v0, LX2/n;->c:LX2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic c()LX2/n;
    .locals 1

    .line 1
    sget-object v0, LX2/n;->a:LX2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public static j()LX2/n;
    .locals 1

    .line 1
    sget-object v0, LX2/n;->a:LX2/n;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public abstract d(II)LX2/n;
.end method

.method public abstract e(JJ)LX2/n;
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)LX2/n;
.end method

.method public abstract g(ZZ)LX2/n;
.end method

.method public abstract h(ZZ)LX2/n;
.end method

.method public abstract i()I
.end method
