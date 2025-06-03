.class public LT3/n$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/Object;

.field public final d:LT3/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;LT3/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT3/n$l;->a:Ljava/lang/String;

    iput-object p2, p0, LT3/n$l;->b:Ljava/util/List;

    iput-object p3, p0, LT3/n$l;->c:Ljava/lang/Object;

    iput-object p4, p0, LT3/n$l;->d:LT3/p;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;LT3/p;LT3/n$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, LT3/n$l;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;LT3/p;)V

    return-void
.end method

.method public static synthetic a(LT3/n$l;)LT3/p;
    .locals 0

    .line 1
    iget-object p0, p0, LT3/n$l;->d:LT3/p;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$l;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LT3/p;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$l;->d:LT3/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$l;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
