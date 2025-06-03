.class public final synthetic LY1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:LY1/m;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LY1/m$b;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/Date;

.field public final synthetic f:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(LY1/m;Ljava/lang/String;LY1/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY1/k;->a:LY1/m;

    .line 5
    .line 6
    iput-object p2, p0, LY1/k;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LY1/k;->c:LY1/m$b;

    .line 9
    .line 10
    iput-object p4, p0, LY1/k;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, LY1/k;->e:Ljava/util/Date;

    .line 13
    .line 14
    iput-object p6, p0, LY1/k;->f:Ljava/util/Date;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .line 1
    iget-object v0, p0, LY1/k;->a:LY1/m;

    .line 2
    .line 3
    iget-object v1, p0, LY1/k;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LY1/k;->c:LY1/m$b;

    .line 6
    .line 7
    iget-object v3, p0, LY1/k;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, LY1/k;->e:Ljava/util/Date;

    .line 10
    .line 11
    iget-object v5, p0, LY1/k;->f:Ljava/util/Date;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    move v7, p2

    .line 15
    invoke-static/range {v0 .. v7}, LY1/m;->V1(LY1/m;Ljava/lang/String;LY1/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Landroid/content/DialogInterface;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
