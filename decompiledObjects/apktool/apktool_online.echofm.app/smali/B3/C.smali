.class public final synthetic LB3/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr4/a$a;


# instance fields
.field public final synthetic a:Lr4/a$a;

.field public final synthetic b:Lr4/a$a;


# direct methods
.method public synthetic constructor <init>(Lr4/a$a;Lr4/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB3/C;->a:Lr4/a$a;

    .line 5
    .line 6
    iput-object p2, p0, LB3/C;->b:Lr4/a$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lr4/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB3/C;->a:Lr4/a$a;

    .line 2
    .line 3
    iget-object v1, p0, LB3/C;->b:Lr4/a$a;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LB3/D;->c(Lr4/a$a;Lr4/a$a;Lr4/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
