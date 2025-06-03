.class public LH3/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/s;->j(LO3/i;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LO3/i;

.field public final synthetic p:LH3/s;


# direct methods
.method public constructor <init>(LH3/s;LO3/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/s$a;->p:LH3/s;

    .line 2
    .line 3
    iput-object p2, p0, LH3/s$a;->o:LO3/i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LH3/s$a;->p:LH3/s;

    .line 2
    .line 3
    iget-object v1, p0, LH3/s$a;->o:LO3/i;

    .line 4
    .line 5
    invoke-static {v0, v1}, LH3/s;->a(LH3/s;LO3/i;)LV2/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LH3/s$a;->a()LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
