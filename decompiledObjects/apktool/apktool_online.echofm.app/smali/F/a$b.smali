.class public LF/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LF/g$c;

.field public final synthetic p:I

.field public final synthetic q:LF/a;


# direct methods
.method public constructor <init>(LF/a;LF/g$c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/a$b;->q:LF/a;

    .line 2
    .line 3
    iput-object p2, p0, LF/a$b;->o:LF/g$c;

    .line 4
    .line 5
    iput p3, p0, LF/a$b;->p:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LF/a$b;->o:LF/g$c;

    .line 2
    .line 3
    iget v1, p0, LF/a$b;->p:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LF/g$c;->a(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
