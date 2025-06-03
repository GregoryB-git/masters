.class public final synthetic LN5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:LN5/h;

.field public final synthetic p:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(LN5/h;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN5/d;->o:LN5/h;

    .line 5
    .line 6
    iput-object p2, p0, LN5/d;->p:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LN5/d;->o:LN5/h;

    .line 2
    .line 3
    iget-object v1, p0, LN5/d;->p:Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {v0, v1}, LN5/h;->d(LN5/h;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
