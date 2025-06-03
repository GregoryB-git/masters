.class public final Lg/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg/w$a;
    }
.end annotation


# static fields
.field public static d:Lg/w;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/location/LocationManager;

.field public final c:Lg/w$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg/w$a;

    invoke-direct {v0}, Lg/w$a;-><init>()V

    iput-object v0, p0, Lg/w;->c:Lg/w$a;

    iput-object p1, p0, Lg/w;->a:Landroid/content/Context;

    iput-object p2, p0, Lg/w;->b:Landroid/location/LocationManager;

    return-void
.end method
