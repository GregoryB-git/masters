.class public LB6/h$a;
.super LB6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB6/h;->a(LB6/d;JLD6/b;)LB6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:J

.field public final synthetic p:LD6/b;


# direct methods
.method public constructor <init>(LB6/d;JLD6/b;)V
    .locals 0

    .line 1
    iput-wide p2, p0, LB6/h$a;->o:J

    .line 2
    .line 3
    iput-object p4, p0, LB6/h$a;->p:LD6/b;

    .line 4
    .line 5
    invoke-direct {p0}, LB6/h;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c()LD6/b;
    .locals 1

    .line 1
    iget-object v0, p0, LB6/h$a;->p:LD6/b;

    .line 2
    .line 3
    return-object v0
.end method
