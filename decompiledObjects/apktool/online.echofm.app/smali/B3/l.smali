.class public final synthetic LB3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr4/b;


# instance fields
.field public final synthetic a:LB3/o;

.field public final synthetic b:LB3/c;


# direct methods
.method public synthetic constructor <init>(LB3/o;LB3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB3/l;->a:LB3/o;

    .line 5
    .line 6
    iput-object p2, p0, LB3/l;->b:LB3/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LB3/l;->a:LB3/o;

    .line 2
    .line 3
    iget-object v1, p0, LB3/l;->b:LB3/c;

    .line 4
    .line 5
    invoke-static {v0, v1}, LB3/o;->j(LB3/o;LB3/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
