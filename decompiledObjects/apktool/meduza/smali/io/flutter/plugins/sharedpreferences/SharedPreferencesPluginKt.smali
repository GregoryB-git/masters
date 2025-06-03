.class public final Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic $$delegatedProperties:[Ljc/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljc/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final LIST_PREFIX:Ljava/lang/String; = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"

.field public static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "FlutterSharedPreferences"

.field public static final TAG:Ljava/lang/String; = "SharedPreferencesPlugin"

.field private static final sharedPreferencesDataStore$delegate:Lfc/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [Ljc/h;

    .line 3
    .line 4
    new-instance v2, Lec/n;

    .line 5
    .line 6
    const-class v3, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;

    .line 7
    .line 8
    const-string v4, "sharedPreferencesDataStore"

    .line 9
    .line 10
    const-string v5, "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 11
    .line 12
    invoke-direct {v2, v3, v4, v5, v0}, Lec/n;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lec/t;->a:Lec/u;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    aput-object v2, v1, v0

    .line 22
    .line 23
    sput-object v1, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;->$$delegatedProperties:[Ljc/h;

    .line 24
    .line 25
    const-string v0, "FlutterSharedPreferences"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const/16 v2, 0xe

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lp2/m0;->Y(Ljava/lang/String;Lp0/a;I)Lq0/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;->sharedPreferencesDataStore$delegate:Lfc/a;

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public static final synthetic access$getSharedPreferencesDataStore(Landroid/content/Context;)Lo0/i;
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;->getSharedPreferencesDataStore(Landroid/content/Context;)Lo0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final getSharedPreferencesDataStore(Landroid/content/Context;)Lo0/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lo0/i<",
            "Lr0/d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;->sharedPreferencesDataStore$delegate:Lfc/a;

    sget-object v1, Lio/flutter/plugins/sharedpreferences/SharedPreferencesPluginKt;->$$delegatedProperties:[Ljc/h;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lfc/a;->a(Ljava/lang/Object;Ljc/h;)Lr0/b;

    move-result-object p0

    return-object p0
.end method
