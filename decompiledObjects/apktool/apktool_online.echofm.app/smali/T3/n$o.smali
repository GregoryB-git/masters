.class public LT3/n$o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "o"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/util/Map;

.field public c:LT3/p;

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;LT3/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT3/n$o;->a:Ljava/lang/String;

    iput-object p2, p0, LT3/n$o;->b:Ljava/util/Map;

    iput-object p3, p0, LT3/n$o;->c:LT3/p;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;LT3/p;LT3/n$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, LT3/n$o;-><init>(Ljava/lang/String;Ljava/util/Map;LT3/p;)V

    return-void
.end method

.method public static synthetic a(LT3/n$o;)LT3/p;
    .locals 0

    .line 1
    iget-object p0, p0, LT3/n$o;->c:LT3/p;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$o;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LT3/p;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$o;->c:LT3/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$o;->b:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LT3/n$o;->d:Z

    .line 3
    .line 4
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LT3/n$o;->d:Z

    .line 2
    .line 3
    return v0
.end method
