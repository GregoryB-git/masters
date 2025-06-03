.class public final synthetic LB1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB1/m$b;


# instance fields
.field public final synthetic a:LO1/r;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LO1/r;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB1/c;->a:LO1/r;

    .line 5
    .line 6
    iput-object p2, p0, LB1/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LB1/c;->a:LO1/r;

    .line 2
    .line 3
    iget-object v1, p0, LB1/c;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, LB1/e;->b(LO1/r;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
