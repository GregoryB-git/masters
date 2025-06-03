.class public final synthetic LV3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:LV3/x;

.field public final synthetic p:La4/i;


# direct methods
.method public synthetic constructor <init>(LV3/x;La4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/w;->o:LV3/x;

    .line 5
    .line 6
    iput-object p2, p0, LV3/w;->p:La4/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/w;->o:LV3/x;

    .line 2
    .line 3
    iget-object v1, p0, LV3/w;->p:La4/i;

    .line 4
    .line 5
    invoke-static {v0, v1}, LV3/x;->a(LV3/x;La4/i;)Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
