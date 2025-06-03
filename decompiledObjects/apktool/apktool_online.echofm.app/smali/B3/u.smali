.class public final synthetic LB3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/Map$Entry;

.field public final synthetic p:Ln4/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Ln4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB3/u;->o:Ljava/util/Map$Entry;

    .line 5
    .line 6
    iput-object p2, p0, LB3/u;->p:Ln4/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LB3/u;->o:Ljava/util/Map$Entry;

    .line 2
    .line 3
    iget-object v1, p0, LB3/u;->p:Ln4/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, LB3/v;->e(Ljava/util/Map$Entry;Ln4/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
