.class public Ld3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/d$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Ld3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ld3/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ld3/d;->a:Ljava/util/logging/Logger;

    .line 12
    .line 13
    new-instance v0, Ld3/d;

    .line 14
    .line 15
    invoke-direct {v0}, Ld3/d;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Ld3/d;->b:Ld3/d;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d()Ljava/util/logging/Logger;
    .locals 1

    .line 1
    sget-object v0, Ld3/d;->a:Ljava/util/logging/Logger;

    .line 2
    .line 3
    return-object v0
.end method

.method public static e()V
    .locals 1

    .line 1
    sget-object v0, Ld3/d;->b:Ld3/d;

    .line 2
    .line 3
    invoke-static {v0}, Lc3/x;->n(Lc3/w;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lc3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lc3/v;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld3/d;->f(Lc3/v;)Lc3/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lc3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Lc3/v;)Lc3/a;
    .locals 2

    .line 1
    new-instance v0, Ld3/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Ld3/d$b;-><init>(Lc3/v;Ld3/d$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
