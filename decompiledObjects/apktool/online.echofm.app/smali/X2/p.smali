.class public LX2/p;
.super LX2/z;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J

.field public static final u:LX2/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LX2/p;

    .line 2
    .line 3
    invoke-direct {v0}, LX2/p;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX2/p;->u:LX2/p;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-static {}, LX2/w;->j()LX2/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-direct {p0, v0, v1, v2}, LX2/z;-><init>(LX2/w;ILjava/util/Comparator;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LX2/p;->u:LX2/p;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX2/p;->h()LX2/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h()LX2/w;
    .locals 1

    .line 1
    invoke-super {p0}, LX2/x;->h()LX2/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
