.class public final Le0/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lb1/k;

.field public b:Lb1/m;


# direct methods
.method public constructor <init>(Lb1/k;Lb1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/m$a;->a:Lb1/k;

    iput-object p2, p0, Le0/m$a;->b:Lb1/m;

    invoke-virtual {p1, p2}, Lb1/k;->a(Lb1/n;)V

    return-void
.end method
